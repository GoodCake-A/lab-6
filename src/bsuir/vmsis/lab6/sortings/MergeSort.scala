package bsuir.vmsis.lab6.sortings

import bsuir.vmsis.lab6.players.SoccerPlayer
import scala.collection.mutable.ListBuffer
import scala.annotation.tailrec

object MergeSort {

  def sort(list: List[SoccerPlayer], comparator: (SoccerPlayer, SoccerPlayer) => Int): List[SoccerPlayer] = {
    def rec(i: Iterator[SoccerPlayer], length: Int): ListBuffer[SoccerPlayer] = {
      val sortedList = ListBuffer.empty[SoccerPlayer]
      if (length > 1) {
        val iterators=i.duplicate
        val list1 = rec(iterators._1, length / 2)
        val list2 = rec(iterators._2.drop(length / 2), length / 2 + length % 2)
        var i1 = list1.iterator
        var i2 = list2.iterator
        while(i1.hasNext&&i2.hasNext){
          val tmp1=i1.duplicate
          val tmp2=i2.duplicate
          i1=tmp1._1
          i2=tmp2._1
          if(comparator(tmp1._2.next(),tmp2._2.next())<=0)
            sortedList+=i1.next
          else
            sortedList+=i2.next
        }
        if(i1.hasNext)
          i1.foreach(sortedList+=_)
        else
          i2.foreach(sortedList+=_)
      } 
      else
        sortedList += i.next()
      sortedList
    }
    if(list.length>0)
      rec(list.iterator, list.length).toList
    else{
      val emptyList: List[SoccerPlayer]= Nil
      emptyList
    }   
  }
  
  def sortReverse(list: List[SoccerPlayer], comparator: (SoccerPlayer, SoccerPlayer) => Int): List[SoccerPlayer] = {
    sort(list,(p1: SoccerPlayer, p2: SoccerPlayer)=>{comparator(p1,p2) * -1})
  }
  
}