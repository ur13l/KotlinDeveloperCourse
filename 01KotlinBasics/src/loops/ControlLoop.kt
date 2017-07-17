package loops
fun main (args : Array<String>) {

    loopq@for (count in 1..10) {
        //if (count == 4){
          //  continue //Pass to the next iteration
            //break It ends the iteration of loop.
        //}

        for (count2 in 1..5) {
            if (count2 == 2) {
                break@loopq //The loop can be identified by its name.
            }
            println("count2: $count")
        }
        println("count: $count")

    }
}