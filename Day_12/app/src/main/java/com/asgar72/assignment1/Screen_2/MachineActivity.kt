package com.asgar72.assignment1.Screen_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.asgar72.assignment_1.R

class MachineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine)

        val txtML = findViewById<TextView>(R.id.txtML)
        val txtYt4 = findViewById<TextView>(R.id.txtYt4)

        txtML.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/machine-learning")
            startActivity(intent)
        }

        txtYt4.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=ZftI2fEz0Fw&list=PLKnIA16_Rmvbr7zKYQuBfsVkjoLcJgxHH")
            startActivity(intent)
        }
    }
}