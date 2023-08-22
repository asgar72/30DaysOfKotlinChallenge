package com.asgar72.day18viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.asgar72.day18viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.checkBox.isChecked) {
                val intent = Intent(this, Activity2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please accept T&C", Toast.LENGTH_SHORT).show()
            }
        }

    }
}