package com.asgar72.day27bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val bottomView = findViewById<BottomNavigationView>(R.id.bottomNav)

        replaceWithFragment(Home())
        // by default, home fragment should be visible to the user

        bottomView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> replaceWithFragment(Home())
                R.id.item2 -> replaceWithFragment(Search())
                R.id.item3 -> replaceWithFragment(Profiles())

                else -> {

                }
            }
            true
        }
    }

    private fun replaceWithFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}