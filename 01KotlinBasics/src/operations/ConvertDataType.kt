package operations

/**
 * Created by uriel on 8/07/17.
 */


fun main (args: Array<String>) {
    var n1 : Int = 10
    var n2 : Int?
    var n2Str : String = "12"
    var n2Float : Float?
    n2 = n2Str.toInt()
    n2Float = n2Str.toFloat()

    println("n1: " + n1)
    println("n2: " + n2)
    println("n2Float: " + n2Float);

    var xpi: Double = 3.14
    println ("xpi: " + xpi)
    var intXpi : Int = xpi.toInt();
    println ("intXpi: " + intXpi)
}