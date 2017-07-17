package decision

fun main (args : Array<String>) {
    println("Enter your grade: ")
    var grade : Double = readLine()!!.toDouble()

    if (grade >= 90) {
        println("You are in A level")
    }
    else if (grade >= 80) {
        println("You are in B level")
    }
    else if (grade >= 70) {
        println ("You are in C level")
    }
    else if (grade >= 60) {
        println ("You are in D level")
    }
    else {
        println ("You failed")
    }

    println("You enter grade $grade")
}

