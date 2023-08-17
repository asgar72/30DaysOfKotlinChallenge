package com.asgar72.assignment1.Screen_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.asgar72.assignment_1.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val txtContactUs = findViewById<TextView>(R.id.txtContactUs)

        txtContactUs.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://asgar72.github.io")
            startActivity(intent)
        }

        val card1 = findViewById<CardView>(R.id.card1)
        val card2 = findViewById<CardView>(R.id.card2)
        val card3 = findViewById<CardView>(R.id.card3)
        val card4 = findViewById<CardView>(R.id.card4)

        card1.setOnClickListener {
                intent = Intent(applicationContext,AndroidActivity::class.java)
                startActivity(intent)
        }

        card2.setOnClickListener {
            intent = Intent(applicationContext,IOSActivity::class.java)
            startActivity(intent)
        }

        card3.setOnClickListener {
            intent = Intent(applicationContext,WebActivity::class.java)
            startActivity(intent)
        }

        card4.setOnClickListener {
            intent = Intent(applicationContext,MachineActivity::class.java)
            startActivity(intent)
        }

    }
}