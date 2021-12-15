package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.app.ProgressDialog




class MyStockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_stock)
        val sellmic = findViewById<Button>(R.id.sellmicr)
        val sellgoo= findViewById<Button>(R.id.sellgoog)

        sellmic.setOnClickListener {


            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)}

            sellgoo.setOnClickListener {
                val intent = Intent(this, UserProfileActivity::class.java)
                startActivity(intent)

        }
    }
}