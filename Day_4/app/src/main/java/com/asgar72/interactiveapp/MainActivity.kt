package com.asgar72.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = findViewById<LinearLayout>(R.id.layout)
        val btnDark = findViewById<Button>(R.id.btnDark)
        val btnRed = findViewById<Button>(R.id.btnRed)
        val btnBlue = findViewById<Button>(R.id.btnBlue)
        val btnYellow = findViewById<Button>(R.id.btnYellow)
        val btnPink = findViewById<Button>(R.id.btnPink)

        btnDark.setOnClickListener {
            //change to dark mode
            layout.setBackgroundResource(R.color.black)
        }
        btnRed.setOnClickListener {
            //change to dark mode
            layout.setBackgroundResource(R.color.Red)
        }

        btnBlue.setOnClickListener {
            //change to dark mode
            layout.setBackgroundResource(R.color.Blue)
        }

        btnYellow.setOnClickListener {
            //change to dark mode
            layout.setBackgroundResource(R.color.Yellow)
        }

        btnPink.setOnClickListener {
            //change to dark mode
            layout.setBackgroundResource(R.color.Pink)
        }
    }
}