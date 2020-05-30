package bsuir.vmsis.lab6

import bsuir.vmsis.lab6.players.SoccerPlayer
import bsuir.vmsis.lab6.players.PlayersComparator
import bsuir.vmsis.lab6.sortings.MergeSort

object Source {
  def main(args: Array[String]){
    val list: List[SoccerPlayer]= (new SoccerPlayer("Neymar",31))::(new SoccerPlayer("Andrei",9))::(new SoccerPlayer("Bill",12))::(new SoccerPlayer("Jack",3))::Nil
    val list2: List[SoccerPlayer]= (new SoccerPlayer("Andrei",9))::(new SoccerPlayer("Bill",12))::(new SoccerPlayer("Jack",3))::(new SoccerPlayer("Neymar",31))::Nil
    def output(list: List[SoccerPlayer])={
      for(element<-list)
        println(element)
      println()
    }
    output(list)
    output(MergeSort.sort(list, PlayersComparator.compareByGoals))
    output(MergeSort.sortReverse(list, PlayersComparator.compareByGoals))
  }
}