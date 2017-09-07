package Examples.Example999

import Examples.ExampleJava.JavaCode

/**
 * Created by Y on 9/2/2017.
 */

fun multiplyXandY(x: Int, y: Int) : Int {
    var result = 0
    for (i in 1..y) {
        JavaCode.plusXandY(result, x);
    }

    return result
}
class MathUtilities (var a: Int, var b: Int){
    fun printSum() {
        print(a + b)
    }
}

