package com.example.thaitravelguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_south.*

class SouthActivity : AppCompatActivity() {

    private lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_south)


        img_pkt.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_cpn.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_nrt.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_pna.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_trg.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_kbi.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_plg.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_rng.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_stn.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_ska.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_sni.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_nwt.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_yla.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }

        img_ptn.setOnClickListener {
            intent = Intent(this,Coming_soon::class.java)
            startActivity(intent)
        }


        slidr = Slidr.attach(this)
    }
}