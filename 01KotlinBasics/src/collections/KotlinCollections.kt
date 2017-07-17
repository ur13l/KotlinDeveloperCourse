package collections
fun main (args : Array<String>) {
    var map = hashMapOf(1 to "Uriel", 2 to "Infante")
    map.put(3, "Martínez")
    println(map.get(3))
    println(map[3])

    var ar = arrayOf(1, 20, 30, 200)
    println(ar[3])

    //var l = listOf (11, 22, 33, 44)
    var l = mutableListOf (11, 22, 33, 44)
    l[0] = 200
    for (item in l) {
        println(item)
    }
}