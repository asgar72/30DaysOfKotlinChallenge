package com.asgar72.day21photoframe

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var currentPic = 0
    lateinit var image: ImageView

    var name = arrayOf("Sundar Phichai","Asgar abbas","Shajar Haider","Sahil Khan")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val prev = findViewById<ImageButton>(R.id.imgPrev)
        val next = findViewById<ImageButton>(R.id.imgNext)
        val text = findViewById<TextView>(R.id.textView)

        prev.setOnClickListener {
            val idCurrentImageString = "pic$currentPic"
            //convert string id into integer associated with it
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentPic = (4+ currentPic - 1)%4
            val idImageToShowString = "pic$currentPic"
            //convert string id into integer associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            text.text = name[currentPic]
        }

        next.setOnClickListener {
            val idCurrentImageString = "pic$currentPic"
            //convert string id into integer associated with it
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentPic = (4+ currentPic + 1)%4
            val idImageToShowString = "pic$currentPic"
            //convert string id into integer associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            text.text = name[currentPic]

        }
    }
}