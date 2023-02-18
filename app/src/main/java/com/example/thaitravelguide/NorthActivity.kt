package com.example.thaitravelguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_north.*

class NorthActivity : AppCompatActivity() {

    private lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_north)

        img_cri.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_cmi.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_nan.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_pyo.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_msn.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_pre.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_lpg.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_lpn.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_utd.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }


        slidr = Slidr.attach(this)
    }
}