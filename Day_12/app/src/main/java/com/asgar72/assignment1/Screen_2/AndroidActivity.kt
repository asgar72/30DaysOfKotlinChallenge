package com.asgar72.assignment1.Screen_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.asgar72.assignment_1.R

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val txtAndroid = findViewById<TextView>(R.id.txtAndroid)
        val txtYt1 = findViewById<TextView>(R.id.txtYt1)

        txtAndroid.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kotlinlang.org/docs/getting-started.html")
            startActivity(intent)
        }

        txtYt1.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/@saumya1singh")
            startActivity(intent)
        }
    }
}