package Examples.Example1

/**
 * Created by Y on 9/2/2017.
 */

fun topLevelFunction(a: Int) {
    print(a)
}

class Functions {
    fun memberFunction(a: Int) {
        print(a)
    }

    fun outerFunction(a: Int, b:Int) {

        fun localFunction(a: Int) {
            print(a) //local a
            print(b) //parent b
        }

        localFunction(a)
    }
}