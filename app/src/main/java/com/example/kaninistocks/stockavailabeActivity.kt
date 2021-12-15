package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class stockavailabeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stockavailabe)

        val google = findViewById<TextView>(R.id.google)
        val microsoft = findViewById<TextView>(R.id.microsoft)
        val Tesla = findViewById<TextView>(R.id.testla)

        val profileButton = findViewById<Button>(R.id.profileButton)
        val stock = findViewById<Button>(R.id.stockButton)

        profileButton.setOnClickListener{
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)

        }

        microsoft.setOnClickListener {
            val intent = Intent(this, StockBuyingActivity::class.java)
            startActivity(intent)

        google.setOnClickListener {
            val intent = Intent(this, stockbuyinggoogle::class.java)
            startActivity(intent)

                Tesla.setOnClickListener {
                    val intent = Intent(this, stockbuyingtestla::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
