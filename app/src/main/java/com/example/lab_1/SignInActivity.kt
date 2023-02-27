package com.example.lab_1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnNavigateToLoggIn = findViewById<Button>(R.id.btn_LoggIn)
        val eUserEmail = findViewById<EditText>(R.id.emailEditText)
        val ePassWord = findViewById<EditText>(R.id.passwordEditText)

        val sharePreferences = getSharedPreferences("MY_PRE", Context.MODE_PRIVATE)
        val getEmail = sharePreferences.getString("EMAIL", "")
        val getPassword = sharePreferences.getString("PASSWORD", "")

        if( getEmail === "" && getPassword === "") {

            val i = Intent( this, LoggedInActivity::class.java)
            startActivity(i)
        }




        btnNavigateToLoggIn.setOnClickListener{

            val email = eUserEmail.text.toString()
            val password = ePassWord.text.toString()


            val editor = sharePreferences.edit()
            editor.putString("EMAIL", email)
            editor.putString("PASSWORD", password)
            editor.apply()

            val i = Intent( this, LoggedInActivity::class.java)
            startActivity(i)


        }





        // Go back Button
        val btnGoBack = findViewById<Button>(R.id.btn_GoBackSignIn)
        val intentbtnGoBack = Intent(this, AboutActivity::class.java )


        // Go back Button
        btnGoBack.setOnClickListener{

            startActivity(intentbtnGoBack)
        }





    }




}