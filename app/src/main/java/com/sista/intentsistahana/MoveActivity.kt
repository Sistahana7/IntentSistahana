package com.sista.intentsistahana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MoveActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        button = findViewById(R.id.button);

        button.setOnClickListener(){
            super.onBackPressed();
        }
    }
}