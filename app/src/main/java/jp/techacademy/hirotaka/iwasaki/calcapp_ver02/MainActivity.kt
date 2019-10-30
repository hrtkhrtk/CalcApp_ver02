package jp.techacademy.hirotaka.iwasaki.calcapp_ver02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus_button.setOnClickListener(this)
        minus_button.setOnClickListener(this)
        multiple_button.setOnClickListener(this)
        divide_button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        when(v.id){
            R.id.plus_button -> {
                val value = editText_val_01.text
                intent.putExtra("VALUE", value)
                Log.d("test191030n10", value.toString())
            }
            R.id.minus_button -> {
                val value = editText_val_01.text
                intent.putExtra("VALUE", value)
                Log.d("test191030n11", value.toString())
            }
            R.id.multiple_button -> {
                val value = editText_val_01.text
                intent.putExtra("VALUE", value)
                Log.d("test191030n12", value.toString())
            }
            R.id.divide_button -> {
                val value = editText_val_01.text
                intent.putExtra("VALUE", value)
                Log.d("test191030n13", value.toString())
            }
        }
        startActivity(intent)
    }
}
