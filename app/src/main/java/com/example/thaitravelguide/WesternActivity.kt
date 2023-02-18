package com.example.thaitravelguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_western.*

class WesternActivity : AppCompatActivity() {

    private lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_western)

        img_kri.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_pkn.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_pbi.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_tak.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_rbr.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }



        slidr = Slidr.attach(this)
    }
}