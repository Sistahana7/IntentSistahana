package com.sista.intentsistahana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {
    private lateinit var tvDataReceived: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        tvDataReceived = findViewById(R.id.tv_data_received)
        DataReceived()

        button = findViewById(R.id.button);

        button.setOnClickListener(){
            super.onBackPressed();
        }
    }

    private fun DataReceived() {
        val bundle = intent.extras
        val nama = bundle?.getString("Nama")
        val alamat = bundle?.getString("Alamat")
        val nim = bundle?.getString("NIM")

        tvDataReceived.text = nama + " " + ", " + alamat + " " + ", " +nim
    }
}