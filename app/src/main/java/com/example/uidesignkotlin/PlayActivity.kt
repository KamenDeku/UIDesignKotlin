package com.example.uidesignkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.ImageButton
import android.content.Intent

class PlayActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}