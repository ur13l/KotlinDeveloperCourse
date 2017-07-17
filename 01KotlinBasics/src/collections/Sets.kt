package collections
fun main (args : Array<String>) {
    //Sets are immutable
    var setelements = setOf(12, 23, 34, 45, 56, 67, 78, 89)
    for (element in setelements) {
        println(element)
    }

    //But there are some sets that can be mutable
    var setelementsM = mutableSetOf(12, 23, 34, 45, 56, 67, 78, 89)
    setelementsM.add(23)
    for (element in setelementsM) {
        println(element)
    }
}