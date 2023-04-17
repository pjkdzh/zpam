package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun additionOnClick(view: View) {
        val intent = Intent(this, AdditionActivity::class.java)
        startActivity(intent)
    }
    fun subtractionOnClick(view: View) {
        val intent = Intent(this, SubtractionActivity::class.java)
        startActivity(intent)
    }
}