package jp.techacademy.hirotaka.iwasaki.calcapp_ver02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //val value = intent.getDoubleExtra("VALUE", 0)
        //val value = intent.getString("VALUE", "0")
        val value = intent.getIntExtra("VALUE", 0)
        Log.d("test191030n20", value.toString())
    }
}
