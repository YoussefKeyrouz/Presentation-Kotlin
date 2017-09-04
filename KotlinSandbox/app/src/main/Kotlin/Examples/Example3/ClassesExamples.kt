package Examples.Example3

/**
 * Created by Y on 9/4/2017.
 */


//Constructors
class Foo(val number: Int, var name: String = "Hello") {

    fun printNum() {
        print(number)
    }

    fun changeName() {
        name = "World"
        print(name)
    }

}

//Creation
class Bar {
    fun createFoo() {
        val myFoo = Foo(1)
        myFoo.printNum()
        myFoo.changeName()
    }
}


















//Inheritance.
//Classes are final by default. Effective Java, Item 17: Design and document for inheritance or else prohibit it
class Anything : Any() {
    //Any has equals(), hashCode(), toString()
}

//open allow inheritance
open class Parent(var number: Int) {

    //optional
    init {
        number = 5
    }


    //We want to inherit this
    open fun printMe() {
        print("parent")
    }
}

class Child : Parent(1) {
    //must call parent constructor
    override fun printMe() {

    }
}


class Person(val name: String) {

    private var parent :Person? = null

    //secondary constructor, forced to call primary. Can't define new variables
    constructor(name: String,parent: Person) : this(name) {
        this.parent = parent
    }

    //third constructor
    constructor(name: String, intValue: Int) : this(name) {
        print(intValue)
    }

}








class MyClass {


    // companion object acts like a singleton object linked to the class name (replaces static)
    // companion objects can implement interfaces
    companion object {

        private val TAG = "ABC"

        fun printMe() {
            print("Me")
        }
    }


    fun displayResults() {
        print(TAG)
    }
}

class SecondClass {

    fun printMyClass() {
        MyClass.printMe() //called statically
        MyClass().displayResults() //called from an instance
    }
}












