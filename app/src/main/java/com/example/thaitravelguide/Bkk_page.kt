package com.example.thaitravelguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bkk_page.*

class Bkk_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bkk_page)

        btn_watarun.setOnClickListener {
            intent = Intent(this,Wat_Arun_page::class.java)
            startActivity(intent)
        }


        btn_back.setOnClickListener {
            onBackPressed()
        }
    }
}