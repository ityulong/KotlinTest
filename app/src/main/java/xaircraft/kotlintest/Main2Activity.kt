package xaircraft.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import java.io.File

class Main2Activity : AppCompatActivity() ,View.OnClickListener {

    var lists = listOf("chen","yu","long")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tv_extend_fun.text = lists.build()
        tv_extend_fun.setOnClickListener(this)
        var user: User = User(lists.build(), 21)
        showToast(user.toString())
        user.component1()
    }

    fun copyData(input: File, output: File): Unit {

    }

    fun List<String>.build(): String {
        var result: String = ""
        for (item: String in this) {
            result += item + " "
        }
        return result


    }

    override fun onClick(v: View?) {
        showToast("点击事件")
    }

    override fun onResume() {
        super.onResume()
    }

    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}


