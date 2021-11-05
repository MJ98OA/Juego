import kotlin.random.Random

class Guerrero(var njugador:Int=1,
               var vida:Int=50) {

    var ataque:Int=Random.nextInt(7)

    fun jugadr(){
        var r=Guerrero()
        print(r.toString())
    }
    override fun toString(): String {
        return "$njugador $vida"
    }
}