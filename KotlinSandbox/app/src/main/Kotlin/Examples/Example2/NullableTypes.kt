package Examples.Example2

/**
 * Created by Y on 9/3/2017.
 */


//Ex1 Variable reference
fun foo() {
    var a: String = "hello"
    var b: String? = "world"



//    a = null
//    b = null


//    val lenA = a.length
//    val lenB = b.length

    print(a)
    print(b)
}


















//Ex2 Function return value
fun parseInt(str: String): Int? {
    // return null if str not integer format ...

    print(str)
    return null
}

fun foo2(str1: String, str2: String) {
    val x = parseInt("1")
    val y = parseInt("2")

//    val result = x * y

    print(str1 + str2)
}







//Ex3 how to unwrap: 3 ways: ? , !! and if condition
fun whatToDo() {
    var a: String = "hello"
    var b: String? = "world"






    print(a+b)


}

//3 ways of using if, Works after the &&












//Ex4 Null Safety
class Person {

    //getter and setter example
    var name: String
    get() = "hello $name"
    set(value) {
        if (value.isEmpty())
            name = "Oops"
        else
            name = value
    }


    var car: Car? = null
}

class Car {
    var model: CarModel? = null
}

class CarModel {
    var name: String? = null

}


fun getPersonCarModel(person: Person): String? {
//    return person.car.model.name

    return null
}















