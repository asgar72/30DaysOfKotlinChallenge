package com.asgar72.assignment1.Screen_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.asgar72.assignment_1.R

class IOSActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios)
        val txtIOS = findViewById<TextView>(R.id.txtIOS)
        val txtYt2 = findViewById<TextView>(R.id.txtYt2)

        txtIOS.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.apple.com/tutorials/app-dev-training")
            startActivity(intent)
        }

        txtYt2.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/@iOSAcademy/videos")
            startActivity(intent)
        }
    }
}