package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class stockbuyingtestla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stockbuyingtestla)
        val stockBuy = findViewById<Button>(R.id.buyStockButton)

        stockBuy.setOnClickListener {
            val intent = Intent(this, buyStocktesla::class.java)
            startActivity(intent)
        }
    }
}