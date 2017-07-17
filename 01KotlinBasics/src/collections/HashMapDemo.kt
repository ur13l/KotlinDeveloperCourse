package collections
fun main (args : Array<String>) {
    var map = HashMap<Int, String>()
    map.put(1, "Uriel")
    map.put(2, "Infante")
    map.put(33, "Martínez")

    println(map.get(33))

    map.put(33, "Pérez") //Data updated

    for (k in map.keys) {
        println(map.get(k))
    }

}