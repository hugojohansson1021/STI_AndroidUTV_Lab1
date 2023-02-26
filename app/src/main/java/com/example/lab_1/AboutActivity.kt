package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnNavigateToSignIn = findViewById<Button>(R.id.btn_NavigateToSignIn)
        val intentNavigateToSignIn = Intent(this, SignInActivity::class.java )

        // Go back Button
        val btnGoBack = findViewById<Button>(R.id.btn_GoBack)
        val intentbtnGoBack = Intent(this, MainActivity::class.java )



        btnNavigateToSignIn.setOnClickListener{
            println("does it work?")

            startActivity(intentNavigateToSignIn)
        }


         // Go back Button
        btnGoBack.setOnClickListener{


            startActivity(intentbtnGoBack)
        }










    }
}