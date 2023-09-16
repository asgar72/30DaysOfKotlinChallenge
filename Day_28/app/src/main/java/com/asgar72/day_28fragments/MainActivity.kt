package com.asgar72.day_28fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val buttonTime = findViewById<Button>(R.id.btnTime)
        val buttonExam = findViewById<Button>(R.id.btnExam)

        buttonTime.setOnClickListener {
            replaceFrameWithFragment(Clock_Fragments())
        }

        buttonExam.setOnClickListener {
            replaceFrameWithFragment(Exam_Fragments())
        }
    }

    private fun replaceFrameWithFragment(frag: Fragment) {

        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.frameLayout,frag)
        fragTransaction.commit()
    }
}