package com.asgar72.day22_project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        supportActionBar?.hide()
        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val imgId = intent.getIntExtra("imageid",R.drawable.asgar)

        val nameTv = findViewById<TextView>(R.id.tvname)
        val phoneTv = findViewById<TextView>(R.id.tvNumber)
        val imageId = findViewById<CircleImageView>(R.id.profile_image)
        val txtname = findViewById<TextView>(R.id.txtname)

        nameTv.text=name
        phoneTv.text=phone
        imageId.setImageResource(imgId)
        txtname.text=name
    }
}