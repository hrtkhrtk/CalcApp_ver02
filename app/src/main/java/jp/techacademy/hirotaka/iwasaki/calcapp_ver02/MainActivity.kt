package jp.techacademy.hirotaka.iwasaki.calcapp_ver02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus_button.setOnClickListener(this)
        //minus_button.setOnClickListener(this)
        //multiple_button.setOnClickListener(this)
        //divide_button.setOnClickListener(this)
    }
}
