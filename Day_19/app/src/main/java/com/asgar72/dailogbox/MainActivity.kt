package com.asgar72.dailogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asgar72.dailogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{

        }


    }
}