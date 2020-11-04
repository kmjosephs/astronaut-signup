package com.example.astronautsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_FIRSTNAME = "com.example.astronautsignup.FIRSTNAME"
const val EXTRA_EMAIL = "com.example.astronautsignup.EMAIL"
const val EXTRA_WEBSITE = "com.example.astronautsignup.WEBSITE"

class MainActivity : AppCompatActivity() {
    private lateinit var firstnameEditText : EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var websiteEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstnameEditText = findViewById<EditText>(R.id.firstname)
        emailEditText = findViewById<EditText>(R.id.email)
        passwordEditText = findViewById<EditText>(R.id.password)
        websiteEditText = findViewById<EditText>(R.id.website)
        submitButton = findViewById<Button>(R.id.submit_button)

        submitButton.setOnClickListener {view: View ->
            submitForm()
        }

    }

    private fun submitForm() {
        val firstnameString = firstnameEditText.text.toString()
        val emailString = emailEditText.text.toString()
        val websiteString = websiteEditText.text.toString()
        val intent = Intent(this, ConfirmationActivity::class.java).apply{
            putExtra(EXTRA_FIRSTNAME, firstnameString)
            putExtra(EXTRA_EMAIL, emailString)
            putExtra(EXTRA_WEBSITE, websiteString)
        }
        startActivity(intent)
    }

} // END MAIN ACTIVITY

