package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoggedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val loggIntentFirstName = intent.getStringExtra("key_firstname")
        val loggIntentLastName = intent.getStringExtra("key_lastname")
        val loggInIntentEmail = intent.getStringExtra("key_email")
        val loggInIntentPhoneNr = intent.getStringExtra("key_phoneNr")
        val loggIntentAdress = intent.getStringExtra("key_adress")
        val loggIntentPassword = intent.getStringExtra("key_password")


        val displayFirstName = findViewById<TextView>(R.id.FirstNameTextview)
        val displayLastName = findViewById<TextView>(R.id.LastnameTextView)
        val displayEmail = findViewById<TextView>(R.id.emailTextView)
        val displayPhoneNr = findViewById<TextView>(R.id.phonenrTextView)
        val displayAdress = findViewById<TextView>(R.id.adressTextView)
        val displayPassword = findViewById<TextView>(R.id.passwordTextView)



        // Go back Button
        val btnGoBack = findViewById<Button>(R.id.btn_GoBackLogged)
        val intentbtnGoBack = Intent(this, SignInActivity::class.java )

        // Go back Button
        btnGoBack.setOnClickListener{

            startActivity(intentbtnGoBack)
        }


        displayFirstName.text = loggIntentFirstName
        displayLastName.text = loggIntentLastName
        displayEmail.text = loggInIntentEmail
        displayPhoneNr.text = loggInIntentPhoneNr
        displayAdress.text = loggIntentAdress
        displayPassword.text = loggIntentPassword









    }
}