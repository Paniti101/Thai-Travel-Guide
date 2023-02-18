package com.example.thaitravelguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_eastern.*

class EasternActivity : AppCompatActivity() {

    private lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eastern)

        img_cbi.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_cco.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_pri.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_ryg.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_cti.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_trt.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_skw.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }



        slidr = Slidr.attach(this)
    }
}