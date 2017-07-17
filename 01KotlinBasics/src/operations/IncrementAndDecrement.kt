

fun main (args : Array<String>) {
    var x = 10
    var y = 11
    var z = --x + y // -- as a prefix takes effect before evaluation of the sentence
    println(z)

    var m = x -- + y // -- as a postfix takes effect once the sentence is evaluated.
    println(m)
}