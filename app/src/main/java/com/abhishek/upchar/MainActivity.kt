package com.abhishek.upchar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val call = findViewById<CardView>(R.id.callbtn)
        call.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:102")
            startActivity(intent)
        }

        val help = findViewById<CardView>(R.id.helpbtn)
        help.setOnClickListener {

            val intent = Intent(this, FirstAidHelpActivity::class.java)
            startActivity(intent)

        }

        val check = findViewById<CardView>(R.id.brochurebtn)
        check.setOnClickListener {
            val intent = Intent(this, WebActivity::class.java)
            startActivity(intent)

        }


    }
}