package com.example.astronautsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_FIRSTNAME = "com.example.astronautsignup.FIRSTNAME"

class MainActivity : AppCompatActivity() {
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val firstName = findViewById<EditText>(R.id.firstName)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val website = findViewById<EditText>(R.id.website)
        val submitButton = findViewById<Button>(R.id.submit_button)
        submitButton.setOnClickListener {view: View ->
            submitForm()
        }

    }

    private fun submitForm() {
        val firstNameField = findViewById<EditText>(R.id.firstName)
        val firstName = firstNameField.text.toString()
        val intent = Intent(this, ConfirmationActivity::class.java).apply{
            putExtra(EXTRA_FIRSTNAME, firstName)
        }
        startActivity(intent)
    }

} // END MAIN ACTIVITY

