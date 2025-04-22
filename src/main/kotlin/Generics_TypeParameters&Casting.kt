

fun main() {

    var fplayer = FootballTeam("F Player")
    var fplayer1 = FootballTeam("F1 Player")

    var cPlayer  = CricketTeam("C Player")
    var cPlayer1  = CricketTeam("C1 Player")



}

class Team<T>(val name: String,val listPlayer: MutableList<T>){

    fun addPlayers(player : T){
           if(listPlayer.contains(player)){
               println("Player $player is already in the ")
           }
    }

}


open class Player(val name :String)

class FootballTeam(name: String) : Player(name)
class CricketTeam(name: String) : Player(name)