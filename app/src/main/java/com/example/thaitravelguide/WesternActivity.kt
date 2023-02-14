package com.example.thaitravelguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface

class WesternActivity : AppCompatActivity() {

    private lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_western)

        slidr = Slidr.attach(this)
    }
}