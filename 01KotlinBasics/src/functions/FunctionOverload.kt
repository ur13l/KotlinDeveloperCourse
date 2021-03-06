package functions
fun sum( n1 : Int, n2 : Int) : Int{
    return n1 + n2
}

fun sum( n1 : Int, n2 : Int, n3 : Int) : Int{
    return n1 + n2 + n3
}

fun sum( n1 : Int, n2 : Int, n3 : Int, n4 : Int) : Int{
    return n1 + n2 + n3 + n4
}

fun main (args : Array<String>) : Unit {
    var sumNumber = functions.sum(20, 30)
    println ("functions.sum = $sumNumber")

    sumNumber = functions.sum(20, 30, 50)
    println ("functions.sum = $sumNumber")

    sumNumber = functions.sum(20, 30, 50, 100)
    println("functions.sum = $sumNumber")
}