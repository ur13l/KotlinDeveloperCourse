package decision
fun main (args : Array<String>) {
    var n1 = 10
    var n2 = 20
    var max = if (n1 > n2) n1 else n2
    println ("max value: $max")

    //When
    var age = 30
    var isYoung = when (age) {
        30 -> true
        else -> false
    }

    println ("Is young: $isYoung")
}