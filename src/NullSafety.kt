/**
 * Created by uriel on 8/07/17.
 */

fun main(args: Array<String>) {

    //The question mark is added to make name a nullable object.
    var name:String?
    name = null
    // !! refers to NullSafety, it throws an exception if the value doesn't have a real value assigned.
    print(name!!)
    //Null safety is good and has to be used;
}