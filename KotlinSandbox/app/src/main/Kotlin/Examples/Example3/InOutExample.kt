package Examples.Example3

/**
 * Created by Y on 9/6/2017.
 */

fun testInOut() {
    val list : List<Child> = listOf(Child(), Child(), Child())

    //This works
    val list2 : List<Parent> = list



}

fun testInOut2(comp : Comparable<Parent>) {
    var comp2 : Comparable<Child> = comp
}
