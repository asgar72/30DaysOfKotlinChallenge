package com.asgar72.day22listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.asgar72.day22listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val taskList = arrayListOf<String>()

        taskList.add("Attend Meeting")
        taskList.add("Work on resume")
        taskList.add("Complete App Dev project")
        taskList.add("Buy  a book from market")
        taskList.add("Improve internet presences")
        taskList.add("Watching movie")
        taskList.add("Meet with new friends")
        taskList.add("Dinner with asif")
        taskList.add("Playing Valorant")
        taskList.add("Push code on Github")

        val adapterForMylsitView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        binding.listView.adapter = adapterForMylsitView

        binding.listView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on Item : " + (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }

    }
}