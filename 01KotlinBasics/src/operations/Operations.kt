package operations

/**
 * Math calculators
 */
fun main (args : Array<String>) {
    println("Enter value 1:")
    var n1 : Float = readLine()!!.toFloat()

    println("Enter value 2:")
    var n2 : Float = readLine()!!.toFloat()
    var sum : Float?
    sum = n1 + n2
    println ("Sum: " + sum)
}