package test.scala

import org.scalatest.FunSuite
import bsuir.vmsis.lab6.players.SoccerPlayer

class SoccerPlayerTest extends FunSuite{
  test("Constructor test"){
    val player= new SoccerPlayer("Bob",3)
    assert(player.name.equals("Bob"))
    assert(player.goals==3)
  }
}