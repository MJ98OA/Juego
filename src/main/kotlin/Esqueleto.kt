import kotlin.random.Random

class Esqueleto (var vida:Int=10){
    var ataque:Int=Random.nextInt(5)

    fun Enemigos(lista: MutableList<Esqueleto>){
        repeat(10){
            var r=Esqueleto()
            lista.add(r)
        }
    }

    override fun toString(): String {
        return " vida:$vida  ataque:$ataque"
    }
}