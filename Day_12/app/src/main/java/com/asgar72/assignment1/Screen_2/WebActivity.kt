package com.asgar72.assignment1.Screen_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.asgar72.assignment_1.R

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val txtWeb = findViewById<TextView>(R.id.txtWeb)
        val txtYt3 = findViewById<TextView>(R.id.txtYt3)

        txtWeb.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/whatis")
            startActivity(intent)
        }

        txtYt3.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/@CodeWithHarry")
            startActivity(intent)
        }
    }
}