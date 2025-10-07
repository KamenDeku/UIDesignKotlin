package com.example.uidesignkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.ImageView
import android.content.Intent

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val openPlayView = findViewById<ImageView>(R.id.OpenPlayView)

        openPlayView.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }

        val openNewsView = findViewById<ImageView>(R.id.OpenNewsView)

        openNewsView.setOnClickListener {
            val intent = Intent(this, NewsActivity::class.java)
            startActivity(intent)
        }
    }
}