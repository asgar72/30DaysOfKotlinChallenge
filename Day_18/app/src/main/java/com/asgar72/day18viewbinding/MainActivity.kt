package com.asgar72.day18viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asgar72.day18viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtView.setOnClickListener {

        }

    }
}