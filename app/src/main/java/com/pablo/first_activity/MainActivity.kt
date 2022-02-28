package com.pablo.first_activity

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpButton()
    }

    fun setUpButton() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(
                applicationContext,
                R.string.toastText,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}