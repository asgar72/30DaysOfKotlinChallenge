package com.asgar72.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener {
            //open new activity
            intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}