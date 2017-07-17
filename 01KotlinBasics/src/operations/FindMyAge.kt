package operations

fun main(args : Array<String>) {
    //input
    print ("Enter your date of birth: ")
    var dob:Int = readLine()!!.toInt()

    //process
    var year: Int = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)
    var age: Int = year - dob;

    //output
    println("Your age is $age years")

}