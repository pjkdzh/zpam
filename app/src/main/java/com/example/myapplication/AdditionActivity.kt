package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class AdditionActivity : AppCompatActivity() {
    lateinit var tvResult: TextView
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition)
        tvResult = findViewById(R.id.tvResult)
        etNumber1 = findViewById(R.id.edtNumber1)
        etNumber2 = findViewById(R.id.edtNumber2)

    }

    fun calculateOnClick(view: View) {
            tvResult.text = (etNumber1.text.toString().toInt() + etNumber2.text.toString().toInt()).toString()
    }
}