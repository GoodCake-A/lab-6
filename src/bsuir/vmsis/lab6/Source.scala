package bsuir.vmsis.lab6

import bsuir.vmsis.lab6.players.SoccerPlayer
import bsuir.vmsis.lab6.players.PlayersComparator

object Source {
  def main(args: Array[String]){
    var pl1= new SoccerPlayer("andkkkhkhl",24)
    var pl2 = new SoccerPlayer("vaskk",45)
    if(PlayersComparator.compareByName(pl2, pl1) == 1)
      println("true")
    println("ffff")
  }
}