package com.sista.intentsistahana

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveWithData: Button
    private lateinit var btnDialNumber: Button
    private lateinit var btnResultFormActivity: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        btnMoveWithData = findViewById(R.id.btn_move_with_data)
        btnMoveWithData.setOnClickListener(this)

        btnDialNumber = findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener(this)

        btnResultFormActivity = findViewById(R.id.btn_result_from_activity)
        btnResultFormActivity.setOnClickListener(this)

        tvResult = findViewById(R.id.tv_result)
        PlaceReceived()
    }

    private fun PlaceReceived() {
        val bundle = intent.extras
        val place = bundle?.getString("place")
        tvResult.text =  place
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn_move_activity -> run {
                    val intent = Intent(this, MoveActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_move_with_data -> run {
                    val intent = Intent(this,MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama","Sistahana Sari Dewi")
                    bundle.putString("Alamat","Malang")
                    bundle.putString("NIM","20.52.0015")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                R.id.btn_dial_number -> run {
                    val dialNumber = "081330336870"
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse( "tel:" + dialNumber))
                    startActivity(intent)
                }
                R.id.btn_result_from_activity -> {
                    val intent = Intent( this, MoveForResultActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }

    }