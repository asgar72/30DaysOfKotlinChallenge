package com.asgar72.day_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_orders.*

class OrdersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val ordersOfCustiner = intent.getStringExtra(MainActivity.KEY)

        tvOrder.text = "Order Placed \n \n"+ordersOfCustiner.toString()
    }
}