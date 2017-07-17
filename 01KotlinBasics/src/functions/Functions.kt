package functions
fun main (args : Array<String>) {
    println(sum(2.0,5.0))
    display(20)
    display()
}

fun display (n : Int = 0) : Unit { //Unit is used when the function doesn't have a return value.
    println("N: $n")
}

fun sum (n1 : Double, n2 : Double) : Double {
    //Block of code
    var sum = n1 + n2
    return sum
}