package com.asgar72.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList : ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)

        var newsArrayList = arrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3, R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7)

        var newsHeadingArray  = arrayOf("One nation, one election panel: Harish Salve fought in Kulbhushan Jadhav case, told SC Article 370 was ‘political compromise",
            "Discuss China in special session without any fear...': Sanjay Raut takes dig at PM Modi",
            "Special Session of Parliament: President Droupadi Murmu summons both Houses to meet on September 18",
            "CM Naveen awards Rs 50 lakh to Odisha’s javelin star",
            "Karnataka teacher asks Muslim students to ‘go to Pak’, inquiry initiated",
            "I am transgender, don't tell my dad: Elon Musk's daughter told aunt after cutting ties with father",
            "Actress Silvina Luna dies after plastic surgery mishap")

        // to set arrangement of recyclerView .like vertically or horizontally
        myRecyclerView.layoutManager = LinearLayoutManager(this)

    }
}