package oop

class Car (type : String, model : Int, price : Double, milesDriven : Int, owner : String) {

    var owner : String? = null
    var price : Double? = null
    var milesDriven : Int? = null
    init {
        println("type: $type")
        println("model: $model")
        println("price: $price")
        println("miles driven: $milesDriven")
        println("owner: $owner")
        this.price = price
        this.owner = owner
        this.milesDriven = milesDriven
    }

    fun calculatePrice () : Double{
        return this.price!! - (this.milesDriven!! * 5)
    }

}


fun main (args : Array<String>) {
    var myCar = Car("BMW", 2017, 10000.0, 105, "Uriel")
    println(myCar.calculatePrice())
}