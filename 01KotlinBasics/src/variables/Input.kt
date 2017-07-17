package variables

/**
 * Created by uriel on 31/05/17.
 */

fun main(args : Array<String>) {
    var name: String?
    var lastname: String?
    var age : Int?

    println("Please, enter your name: ")
    name = readLine();

    println("Now, enter your last name")
    lastname = readLine()

    println("How old are you?")
    age = readLine()!!.toInt()

    println ("Hello ${name} ${lastname}, you are ${age} years old");

}