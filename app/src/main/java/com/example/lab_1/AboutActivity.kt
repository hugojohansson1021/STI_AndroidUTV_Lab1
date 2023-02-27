package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
// Go to Sign in
        val btnNavigateToSignIn = findViewById<Button>(R.id.btn_NavigateToSignIn)
        val intentNavigateToSignIn = Intent(this, SignInActivity::class.java )
// logg in acount
        val btnNavigateToLogginPage = findViewById<Button>(R.id.Logg_in_btn_in_about)
        val intentNavigateToLoggInPage = Intent(this, LoggedInActivity::class.java )

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


        btnNavigateToLogginPage.setOnClickListener{


            startActivity(intentNavigateToLoggInPage)
        }









    }
}