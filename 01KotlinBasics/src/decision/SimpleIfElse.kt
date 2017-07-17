package decision

fun main (args : Array<String>) {
    println("Enter your grade: ")
    var grade : Double = readLine()!!.toDouble()

    if (grade >= 90) {
        println("You are in A level")
    }
    else {
        println("You are not in A level")
    }

    println("You enter grade $grade")
}

