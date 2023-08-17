package com.asgar72.first_day

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDownload = findViewById<Button>(R.id.btnDownload)
        val btnUpload = findViewById<Button>(R.id.btnUpload)

        btnDownload.setOnClickListener{
            Toast.makeText(applicationContext, "Downloading...", Toast.LENGTH_SHORT).show()
        }

        btnUpload.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading...", Toast.LENGTH_SHORT).show()
        }
    }
}