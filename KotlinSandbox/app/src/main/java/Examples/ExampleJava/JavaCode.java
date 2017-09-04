package Examples.ExampleJava;


import Examples.Example999.KotlinCodeKt;

/**
 * Created by Y on 9/2/2017.
 */

public class JavaCode {


    public static int plusXandY(int x, int y) {
        return x + y;
    }

    public int getValue() {
        return 2;
    }





    public static int powerXtoY(int x, int y) {
        int result = 1;
        for(int i = 0 ; i < y; i++) {
            result = KotlinCodeKt.multiplyXandY(x, result);
        }
        return result;
    }


}
