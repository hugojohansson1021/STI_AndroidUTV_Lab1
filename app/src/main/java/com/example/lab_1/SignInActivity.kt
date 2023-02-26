package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        val btnNavigateToLoggIn = findViewById<Button>(R.id.btn_LoggIn)
        val firstname: EditText = findViewById(R.id.FirstNameSignIn)
        val lastname: EditText = findViewById(R.id.LastNameSignIn)
        val email: EditText = findViewById(R.id.emailSignIn)
        val phoneNr: EditText = findViewById(R.id.phoneNrSignIn)
        val adress: EditText = findViewById(R.id.adressSignIn)
        val password: EditText = findViewById(R.id.passwordSignIn)


        // Go back Button
        val btnGoBack = findViewById<Button>(R.id.btn_GoBackSignIn)
        val intentbtnGoBack = Intent(this, AboutActivity::class.java )


        btnNavigateToLoggIn.setOnClickListener{
            println("does it work?")

            val intentNavigateTologgIn = Intent(this, LoggedInActivity::class.java).apply {
                putExtra("key_firstname", firstname.text.toString())
                putExtra("key_lastname",lastname.text.toString())
                putExtra("key_email",email.text.toString())
                putExtra("key_phoneNr",phoneNr.text.toString())
                putExtra("key_adress",adress.text.toString())
                putExtra("key_password",password.text.toString())
            }



            startActivity(intentNavigateTologgIn)
        }

        btnGoBack.setOnClickListener{
            startActivity(intentbtnGoBack)
        }



    }
}