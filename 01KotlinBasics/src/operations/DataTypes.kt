package operations

/**
 * Created by uriel on 31/05/17.
 */


fun main(args : Array<String>) {

    //var is for variables that can change later on the code
    //val is used when the variables don't change.
    val firstname = "Uriel"
    val lastname = "Infante"

    //Question mark is for nullable variables
    var job : String?

    job = "Programmer"

    print (String.format("Hi, my name is %s %s and I'm a %s ", firstname, lastname, job ))
}