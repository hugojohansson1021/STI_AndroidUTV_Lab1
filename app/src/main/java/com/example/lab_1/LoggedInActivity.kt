package com.example.lab_1

import android.content.Context
import android.content.Intent
import android.net.Uri
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

        //URL button
        val urlButton = findViewById<Button>(R.id.Url_btn)


        //display logg ins
        val tvDisplay = findViewById<TextView>(R.id.tv_display)

        val sharePreferences = getSharedPreferences("MY_PRE", MODE_PRIVATE)

        val email = sharePreferences.getString("EMAIL","").toString()
        val password = sharePreferences.getString("PASSWORD","")
        tvDisplay.text = "Email is: $email Password is: $password"



        changePorE.setOnClickListener{
            startActivity(intentChangePorE)
        }

        navigateToHome.setOnClickListener{
            startActivity(intentNavigateToHome)
        }

        urlButton.setOnClickListener{
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://github.com/hugojohansson1021/STI_AndroidUTV_Lab1/blob/main/README.md")
            startActivity(openURL)

        }




    }

}

