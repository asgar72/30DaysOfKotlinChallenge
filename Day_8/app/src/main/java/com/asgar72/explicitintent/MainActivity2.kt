package com.asgar72.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn2 = findViewById<Button>(R.id.btn2)

        btn2.setOnClickListener {
            //open new activity
            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}