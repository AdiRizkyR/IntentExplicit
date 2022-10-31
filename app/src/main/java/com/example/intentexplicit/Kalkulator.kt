package com.example.intentexplicit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Kalkulator : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtLength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    private lateinit var tvLuas: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        edtLength = findViewById(R.id.edt_length)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tv_result)
        tvLuas = findViewById(R.id.tv_luas)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnCalculate) {
            val inputLength = edtLength.text.toString().trim()

            var isEmptyFields = false

            if (inputLength.isEmpty()) {
                isEmptyFields = true
                edtLength.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val volume = inputLength.toDouble() * inputLength.toDouble() * inputLength.toDouble()
                tvResult.text = volume.toString()
            }

            if (!isEmptyFields) {
                val luas = inputLength.toDouble() * inputLength.toDouble() * 6
                tvLuas.text = luas.toString()
            }
        }
    }
}