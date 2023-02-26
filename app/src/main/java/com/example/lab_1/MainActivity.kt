package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigate = findViewById<Button>(R.id.btn_navigateToAbout)
        val intentNavigate = Intent(this, AboutActivity::class.java )



        btnNavigate.setOnClickListener{
            println("does it work?")

            startActivity(intentNavigate)
        }


    }
}