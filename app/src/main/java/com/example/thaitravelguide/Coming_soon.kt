package com.example.thaitravelguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_bkk_page.*
import kotlinx.android.synthetic.main.activity_coming_soon.*

class Coming_soon : AppCompatActivity() {

    private lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coming_soon)

        btn_backs.setOnClickListener {
            onBackPressed()
        }

        slidr = Slidr.attach(this)
    }
}