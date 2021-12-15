package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.w3c.dom.Text
class buyStockActivity : AppCompatActivity() {
    var clickCount = 0
    var clickcountprice = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_stock)


            val clickCountDisplayView = findViewById<TextView>(R.id.clickCountView)
            val clickaddButton = findViewById<Button>(R.id.clickincbutton)
            val clicksubButton = findViewById<Button>(R.id.clickdecbutton)
            val clickCountprice = findViewById<TextView>(R.id.clickCountprice)

            clickaddButton.setOnClickListener {
                clickCount++
                clickCountDisplayView.setText("Item: $clickCount")
                clickcountprice = clickcountprice + 337
                clickCountprice.setText("price: $clickcountprice")
            }
            clicksubButton.setOnClickListener {
                if (clickCountDisplayView != null)
                    clickCount--
                clickCountDisplayView.setText("Item: $clickCount")
                clickcountprice = clickcountprice - 337
                clickCountprice.setText("price: $clickcountprice")

                val createowning = findViewById<Button>(R.id.owningstock)
                createowning.setOnClickListener() {
                    Toast.makeText(applicationContext, "you owned this stock", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this, UserProfileActivity::class.java)
                    startActivity(intent)
                }

            }
        }

    }

