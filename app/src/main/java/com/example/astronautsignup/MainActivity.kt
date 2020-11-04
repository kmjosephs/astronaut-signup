package com.example.astronautsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

const val EXTRA_FIRSTNAME = "com.example.astronautsignup.FIRSTNAME"
const val EXTRA_EMAIL = "com.example.astronautsignup.EMAIL"
const val EXTRA_WEBSITE = "com.example.astronautsignup.WEBSITE"

class MainActivity : AppCompatActivity() {
    //initialize inputs
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

        submitButton.setOnClickListener {
            submitForm()
        }

    }

    private fun submitForm() {
        // convert fields to strings to use in putExtra
        val firstnameString = firstnameEditText.text.toString()
        val emailString = emailEditText.text.toString()
        val passwordString = passwordEditText.text.toString()
        val websiteString = websiteEditText.text.toString()

        val intent = Intent(this, ConfirmationActivity::class.java).apply{
            putExtra(EXTRA_FIRSTNAME, firstnameString)
            putExtra(EXTRA_EMAIL, emailString)
            putExtra(EXTRA_WEBSITE, websiteString)
        }

        // if email or password is empty show a toast, prevent submission
        // toasts are working on my device but not the emulator
        if (emailString.isEmpty()) {
            var  emailToast = Toast.makeText(this, R.string.email_error, Toast.LENGTH_SHORT)
            emailToast.setGravity(Gravity.BOTTOM, 0, 0)
            emailToast.show()
        } else if (passwordString.isEmpty()){
            var  passwordToast = Toast.makeText(this, R.string.password_error, Toast.LENGTH_SHORT)
            passwordToast.setGravity(Gravity.BOTTOM, 0, 0)
            passwordToast.show()
        } else {
            startActivity(intent)
        }
    }
}

