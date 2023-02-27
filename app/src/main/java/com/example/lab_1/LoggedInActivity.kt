package com.example.lab_1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoggedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)



        val changePorE = findViewById<Button>(R.id.Reset_btn)
        val intentChangePorE = Intent(this, SignInActivity::class.java )

        val navigateToHome = findViewById<Button>(R.id.Home_btn)
        val intentNavigateToHome = Intent(this, MainActivity::class.java )





        val tvDisplay = findViewById<TextView>(R.id.tv_display)

        val sharePreferences = getSharedPreferences("MY_PRE", Context.MODE_PRIVATE)

        val email = sharePreferences.getString("EMAIL","").toString()
        val password = sharePreferences.getString("PASSWORD","")
        tvDisplay.text = "Email is: $email Password is: $password"



        changePorE.setOnClickListener{


            startActivity(intentChangePorE)
        }

        navigateToHome.setOnClickListener{


            startActivity(intentNavigateToHome)
        }






    }

}

