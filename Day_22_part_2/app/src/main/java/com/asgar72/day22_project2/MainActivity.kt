package com.asgar72.day22_project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Irshad","Neeraj","SRK","Asgar","Shajar")
        val lastMsg = arrayOf("Hello bro","Good Morning","Hii ..","Yes bro","I'm fine.")
        val lastMsgTime = arrayOf("11:30 AM","8:10 AM","02:00 PM","10:50 PM","10:59 PM")
        val phoneNumber = arrayOf("6389261616","9948562145","7048165235","8541230349","7789261420")
        val imgId = intArrayOf(R.drawable.irshad,R.drawable.neeraj_chopra,R.drawable.srk,R.drawable.asgar,R.drawable.sh)

        userArrayList = ArrayList()

        for(eachIndex in name.indices) {
            val user = User(name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex],phoneNumber[eachIndex],imgId[eachIndex])
            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)

        listView.isClickable =true
        listView.adapter= MyAdapter(this,userArrayList)

    }
}