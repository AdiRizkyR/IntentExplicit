package com.example.intentexplicit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AddText : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_text)

        var tv_hallo : TextView = findViewById(R.id.tv_hallo)
        var edt_name : EditText = findViewById(R.id.edt_name)
        var edt_nim : EditText = findViewById(R.id.edt_nim)
        var edt_prodi : EditText = findViewById(R.id.edt_prodi)
        var btn_hallo : Button = findViewById(R.id.btn_hallo)
        var tv_result : TextView = findViewById(R.id.tv_result)

        btn_hallo.setOnClickListener {
            val nama = edt_name.text.toString()
            val nim = edt_nim.text.toString()
            val prodi = edt_prodi.text.toString()
            tv_result.text="Hai selamat datang $nama dengan NIM $nim dari Program Studi $prodi"
        }
    }
}