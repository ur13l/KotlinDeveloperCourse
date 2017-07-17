package functions

fun show (name : String) {
    println("name: $name")
}

fun show (number : Int) {
    println("number: $number")
}

fun show (numberD : Double) {
    println("numberD: $numberD")
}

fun main(args : Array<String>) {
    functions.show("Uriel")
    functions.show(10.4)
    functions.show(123)
}