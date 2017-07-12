
fun main (args : Array<String>) {
    println("Enter your grade: ")
    var grade : Double = readLine()!!.toDouble()

    if (grade >= 90) {
        println("You are in A level")
    }


    if (grade >= 50 && grade <= 70) {
        grade += 10
        println("You get extra 10 points")
    }
    println("You enter grade $grade")
}

