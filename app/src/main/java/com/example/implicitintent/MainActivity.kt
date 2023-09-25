package com.example.implicitintent

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(intent)


        }
        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=King&c=apps"))
            startActivity(intent)
        }
    }
}