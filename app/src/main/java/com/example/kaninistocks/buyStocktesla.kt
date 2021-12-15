package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class buyStocktesla : AppCompatActivity() {
    var clickCount = 0
    var clickcountprice=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_stock)
        val clickCountDisplayView = findViewById<TextView>(R.id.clickCountView)
        val clickaddButton = findViewById<Button>(R.id.clickincbutton)
        val clicksubButton = findViewById<Button>(R.id.clickdecbutton)
        val clickCountprice = findViewById<TextView>(R.id.clickCountprice)
        val conform=findViewById<Button>(R.id.done)
        clickaddButton.setOnClickListener {
            clickCount++
            clickCountDisplayView.setText("Item: $clickCount")
            clickcountprice=clickcountprice+1089
            clickCountprice.setText("price: $clickcountprice")
        }
        clicksubButton.setOnClickListener {
            if (clickCountDisplayView != null)
                clickCount--
            clickCountDisplayView.setText("Item: $clickCount")
            clickcountprice = clickcountprice - 1089
            clickCountprice.setText("price: $clickcountprice")

            conform.setOnClickListener {

                val intent = Intent(this, UserProfileActivity::class.java)
                startActivity(intent)}

        }

    }

}

