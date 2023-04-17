package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class SubtractionActivity : AppCompatActivity() {
    lateinit var spinner1: Spinner
    lateinit var spinner2: Spinner
    lateinit var result: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subtraction)

        spinner1 = findViewById(R.id.spNumber1)
        spinner2 = findViewById(R.id.spNumber2)
        button = findViewById(R.id.btnCalculateSub)
        result = findViewById(R.id.tvResultSub)

        button.setOnClickListener {
            result.text = (spinner1.getSelectedItem().toString().toInt() - spinner2.getSelectedItem().toString().toInt()).toString()
        }
    }

}