package com.example.thaitravelguide

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.ScrollView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_wat_arun_page.*

class Wat_Arun_page : AppCompatActivity() {

    var mediaController : MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wat_arun_page)

        if (mediaController == null){
            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }

        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://"
                +packageName+"/"+R.raw.test))
        videoView!!.requestFocus()
//  videoView!!.isPlaying
        videoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext,"วิดีโอจบแล้ว", Toast.LENGTH_LONG).show()
        }

        videoView!!.setOnErrorListener{ mp,what,extra ->
            Toast.makeText(applicationContext,"เกิดข้อผิดพลาด"+"กำลังเล่นวิดีโอ!!!", Toast.LENGTH_LONG).show()

            false
        }

        btn_Top_page.setOnClickListener {
            scrollView.fullScroll(ScrollView.FOCUS_UP)
        }

        btn_back.setOnClickListener {
            onBackPressed()
        }

        btn_map.setOnClickListener {
            openMaps()
        }
    }

    private fun openMaps() {
        val uri = Uri.parse("geo:0, 0?q= วัดอรุณราชวรารามราชวรมหาวิหาร (วัดแจ้ง)")
        intent = Intent(Intent.ACTION_VIEW,uri)
        intent.setPackage("com.google.android.apps.maps")
        startActivity(intent)
    }
}