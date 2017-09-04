package Main

import Examples.ExampleJava.JavaCode
import android.app.Activity
import android.os.Bundle
import com.y2thez.samples.kotlinsandbox.R

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun run() {
        val result = JavaCode.powerXtoY(JavaCode().value, 5)
        print(result)
    }
}
