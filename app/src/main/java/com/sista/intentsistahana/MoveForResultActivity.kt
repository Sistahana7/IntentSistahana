package com.sista.intentsistahana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MoveForResultActivity : AppCompatActivity() {
    var rgPlace: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var btnChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        rgPlace = findViewById(R.id.rg_place)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener {
            val selectedOption: Int = rgPlace!!.checkedRadioButtonId
            radioButton = findViewById(selectedOption)

            val intent = Intent( this, MainActivity:: class.java)
            val bundle = Bundle()
            bundle.putString("place", radioButton.text as String?)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}