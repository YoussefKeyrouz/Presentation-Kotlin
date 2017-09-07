package Examples.Example3

/**
 * Created by Y on 9/6/2017.
 */

fun testOut() {
    val list : List<Child> = listOf(Child(1), Child(2), Child(3))

    //This works
    val list2 : List<Parent> = list



}

fun testIn(comp : Comparable<Parent>) {
    var comp2 : Comparable<Child> = comp
}
