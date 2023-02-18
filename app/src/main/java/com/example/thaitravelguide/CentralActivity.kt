package com.example.thaitravelguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_central.*

class CentralActivity : AppCompatActivity() {

    private lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_central)

        btnc_bkk.setOnClickListener {
            intent = Intent(this,Bkk_page::class.java)
            startActivity(intent)
        }






        slidr = Slidr.attach(this)
    }
}