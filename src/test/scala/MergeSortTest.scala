package test.scala

import bsuir.vmsis.lab6.players.SoccerPlayer
import bsuir.vmsis.lab6.players.PlayersComparator
import bsuir.vmsis.lab6.sortings.MergeSort
import org.scalatest.FunSuite

class MergeSortTest extends FunSuite{
  test("Sort by goals test"){
    val list: List[SoccerPlayer]= (new SoccerPlayer("Neymar",31))::(new SoccerPlayer("Andrei",9))::(new SoccerPlayer("Bill",12))::(new SoccerPlayer("Jack",3))::Nil
    val sortedList=MergeSort.sort(list,PlayersComparator.compareByGoals).iterator
    assert(sortedList.next().goals==3)
    assert(sortedList.next().goals==9)
    assert(sortedList.next().goals==12)
    assert(sortedList.next().goals==31)
    val reversedSortedList=MergeSort.sortReverse(list,PlayersComparator.compareByGoals).iterator
    assert(sortedList.next().goals==31)
    assert(sortedList.next().goals==12)
    assert(sortedList.next().goals==9)
    assert(sortedList.next().goals==3)
  }
  test("Sort by name test"){
    val list: List[SoccerPlayer]= (new SoccerPlayer("Neymar",31))::(new SoccerPlayer("Andrei",9))::(new SoccerPlayer("Bill",12))::(new SoccerPlayer("Jack",3))::Nil
    val sortedList=MergeSort.sort(list,PlayersComparator.compareByName).iterator
    assert(sortedList.next().name.equals("Andrei"))
    assert(sortedList.next().name.equals("Bill"))
    assert(sortedList.next().name.equals("Jack"))
    assert(sortedList.next().name.equals("Neymar"))
    val reversedSortedList=MergeSort.sortReverse(list,PlayersComparator.compareByName).iterator
    assert(sortedList.next().name.equals("Neymar"))
    assert(sortedList.next().name.equals("Jack"))
    assert(sortedList.next().name.equals("Bill"))
    assert(sortedList.next().name.equals("Andrei"))
  }
}