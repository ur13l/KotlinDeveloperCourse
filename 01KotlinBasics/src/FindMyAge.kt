import java.util.*

fun main(args : Array<String>) {
    //input
    print ("Enter your date of birth: ")
    var dob:Int = readLine()!!.toInt()

    //process
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    var age: Int = year - dob;

    //output
    println("Your age is $age years")

}