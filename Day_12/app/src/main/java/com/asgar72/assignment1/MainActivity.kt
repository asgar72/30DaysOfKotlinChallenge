package com.asgar72.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.asgar72.assignment1.Screen_2.HomeActivity
import com.asgar72.assignment_1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnLets = findViewById<Button>(R.id.btnLets)

        btnLets.setOnClickListener {
            intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}