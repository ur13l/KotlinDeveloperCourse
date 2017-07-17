package collections
fun main (args : Array<String>) {
    var arraylist = ArrayList<String>()
    arraylist.add("Felipe")
    arraylist.add("Jorge")
    arraylist.add("Infante")
    arraylist.add("Martínez")

    println("First name: " + arraylist.get(0))
    arraylist.set(1, "Uriel") //Update elements

    println("All elements by object")
    for (item in arraylist) {
        println(item)
    }

    println("All elements by index")
    for (index in 0..arraylist.size-1) {
        println(arraylist[index])
    }

    //Search
    if (arraylist.contains("Uriel")) {
        println ("name is found")
    } else {
        println ("name is not found")
    }
}