package bsuir.vmsis.lab6.players

object PlayersComparator {
    def compareByName(player1: SoccerPlayer, player2: SoccerPlayer): Int={
    if(player1.name==player2.name)
      return 0
    if(player1.name<player2.name){
      return -1
    }
    else
      return 1
  }
  def compareByGoals(player1: SoccerPlayer, player2: SoccerPlayer): Int={
    if(player1.goals==player2.goals)
      return 0
    if(player1.goals<player2.goals){
      return -1
    }
    else
      return 1
  }
}