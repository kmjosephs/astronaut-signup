package com.example.astronautsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.lang.StringBuilder

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val firstname = intent.getStringExtra(EXTRA_FIRSTNAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val website = intent.getStringExtra(EXTRA_WEBSITE)
        val details : String = firstname + "\n" + email + "\n" + website


        val firstNameText = findViewById<TextView>(R.id.firstNameTextView).apply{
            text = firstname
        }
        val detailsText = findViewById<TextView>(R.id.detailsTextView).apply{
            text = details
        }
    }
}