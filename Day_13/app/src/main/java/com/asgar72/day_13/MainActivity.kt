package com.asgar72.day_13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //creating key
    companion object{
        const val KEY = "com.asgar72.day_13.MainActivity.KEY"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val orderPlaced = edt1.text.toString() +" "+ edt2.text.toString() +" "+
                    edt3.text.toString() +" "+ edt4.text.toString()

            intent = Intent(this,OrdersActivity::class.java)
            intent.putExtra(KEY,orderPlaced)
            startActivity(intent)
        }
    }
}