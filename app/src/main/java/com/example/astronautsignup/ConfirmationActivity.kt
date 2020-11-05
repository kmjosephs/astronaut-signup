package com.example.astronautsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        //receive extras from main activity
        val firstname = intent.getStringExtra(EXTRA_FIRSTNAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val website = intent.getStringExtra(EXTRA_WEBSITE)
        val congratulationsText = "Congrats, $firstname!"

        //build a string to display in the details. I could have used Stringbuilder() or multiple TextViews
        val details = "$firstname\n$email\n$website"

        findViewById<TextView>(R.id.congratsTextView).apply{
            text = congratulationsText
        }
        findViewById<TextView>(R.id.detailsTextView).apply{
            text = details
        }
    }
}