package com.example.intentexplicit

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddNumber : Button = findViewById(R.id.btnAddNumber)
        btnAddNumber.setOnClickListener(this)

        val btnAddText : Button = findViewById(R.id.btnAddText)
        btnAddText.setOnClickListener(this)

        val btnKalkulator : Button = findViewById(R.id.btnKalkulator)
        btnKalkulator.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btnAddNumber -> {
                val AddNumber = Intent(this@MainActivity, AddNumber::class.java)
                startActivity(AddNumber)
            }

            R.id.btnAddText -> {
                val AddText = Intent(this@MainActivity, AddText::class.java)
                startActivity(AddText)
            }

            R.id.btnKalkulator -> {
                val Kalkulator = Intent(this@MainActivity, Kalkulator::class.java)
                startActivity(Kalkulator)
            }
        }
    }
}