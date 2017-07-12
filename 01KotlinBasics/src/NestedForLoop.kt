
fun main (args : Array<String>) {
    println("Printing loops")

    for (count1 in 1..5) {
        println("count1: $count1")
        for(count2 in 1..8) {
            println("count2: $count2")
        }
    }

}