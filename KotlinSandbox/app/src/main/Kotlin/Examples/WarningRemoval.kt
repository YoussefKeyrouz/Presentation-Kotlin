package Examples

import Examples.Example1.Functions
import Examples.Example2.foo
import Examples.Example2.foo2
import Examples.Example2.whatToDo
import Examples.Example3.*

/**
 * Created by Y on 9/4/2017.
 */

//Ignore this class. Used just to remove all the non-usage warnings from the demo


fun killWarnings() {
    Person(Person("abc").name, Person("abc"))
    Person("abc", 3)
    Foo(1).name
    Foo(1).number
    Bar().createFoo()
    Foo(2).changeName()
    Functions().outerFunction(1,2)
    Foo(1).printNum()
    Anything()
    Parent(1).number
    Child()
    whatToDo()
    foo()
    foo2("a", "b")
    SecondClass().printMyClass()
}