package com.example.intentexplicit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class AddNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_number)

        var tvCounter : TextView = findViewById(R.id.tvCounter)
        var btnAddNumber : Button = findViewById(R.id.btnAddNumber)

        tvCounter.text="0"

        btnAddNumber.setOnClickListener {
            val currVal = tvCounter.text.toString().toInt()
            val nextVal = currVal + 1
            tvCounter.text = nextVal.toString()

            if (currVal==33){
                tvCounter.text="0"
            }
        }
    }
}