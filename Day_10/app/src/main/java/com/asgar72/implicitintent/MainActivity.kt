package com.asgar72.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardweb = findViewById<CardView>(R.id.cardweb)
        val cardcam = findViewById<CardView>(R.id.cardcam)

        cardweb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://asgar72.github.io")
            startActivity(intent)
        }

        cardcam.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}