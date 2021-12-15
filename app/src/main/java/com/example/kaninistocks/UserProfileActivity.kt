package com.example.kaninistocks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UserProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val profile = findViewById<TextView>(R.id.uProfile)
        val myOrder = findViewById<TextView>(R.id.uOrders)
        val otherUser = findViewById<TextView>(R.id.uOtherUsers)


        profile.setOnClickListener{
            val intent = Intent(this, ProfileScreenActivity::class.java)
            startActivity(intent)

        }

        myOrder.setOnClickListener{
            val intent = Intent(this, MyStockActivity::class.java)
            startActivity(intent)

        }

        otherUser.setOnClickListener{
            val intent = Intent(this, OtherUserActivity::class.java)
            startActivity(intent)

        }
    }
}