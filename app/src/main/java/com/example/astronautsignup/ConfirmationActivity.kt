package com.example.astronautsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val firstName = intent.getStringExtra(EXTRA_FIRSTNAME)

        val firstNameTextView = findViewById<TextView>(R.id.firstNameTextView).apply{
            text = firstName
        }
    }
}