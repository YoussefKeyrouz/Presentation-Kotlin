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

fun printSum(a: Int, b: Int) {
    print(a + b)
}
