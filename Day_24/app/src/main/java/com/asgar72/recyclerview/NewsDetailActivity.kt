package com.asgar72.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        supportActionBar?.hide()
        val heading = intent.getStringExtra("heading")
        val newscontent = intent.getStringExtra("newsContent")
        val imageId = intent.getIntExtra("imageId",R.drawable.img1)

        val newsHeadings = findViewById<TextView>(R.id.newsHeadings)
        val newsDetails = findViewById<TextView>(R.id.newsDetails)
        val newsImages = findViewById<ImageView>(R.id.newsImages)

        newsHeadings.text=heading
        newsDetails.text=newscontent
        newsImages.setImageResource(imageId)


    }
}