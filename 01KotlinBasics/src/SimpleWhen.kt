
fun main (args : Array<String>) {
    var x = 100
    when (x) {
        1,2 -> println("value is 1 or two")
        in 10..30 -> println("value is in range 10-30")
        !in 10..30 -> println("value is not in range 10-30")
        else -> {
            println("value is other")
        }
    }
}