package com.example.thaitravelguide

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    lateinit var viewPage : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        text_btn_c.setOnClickListener {
            intent = Intent(this,CentralActivity::class.java)
            startActivity(intent)
        }

        text_btn_n.setOnClickListener {
            intent = Intent(this,NorthActivity::class.java)
            startActivity(intent)
        }

        text_btn_ne.setOnClickListener {
            intent = Intent(this,NortheastActivity::class.java)
            startActivity(intent)
        }

        text_btn_e.setOnClickListener {
            intent = Intent(this,EasternActivity::class.java)
            startActivity(intent)
        }

        text_btn_w.setOnClickListener {
            intent = Intent(this,WesternActivity::class.java)
            startActivity(intent)
        }

        text_btn_s.setOnClickListener {
            intent = Intent(this,SouthActivity::class.java)
            startActivity(intent)
        }

//        val textbtn_search : TextView = findViewById(R.id.textbtn_search)
//        textbtn_search.setOnClickListener {
//            intent = Intent(this,MainActivity2::class.java)
//            startActivity(intent)
//        }

////ViewPage2
        viewPage = findViewById(R.id.viewPager2)
        val imageList = listOf(R.drawable.banner1,R.drawable.banner2,R.drawable.banner3,R.drawable.banner4,R.drawable.banner5,R.drawable.banner6,R.drawable.banner7)
        val adapter = ViewPagerAdapter(imageList)
        viewPage.adapter = adapter
        viewPage.autoScroll(lifecycleScope,3500)
}
    ////ViewPage2 (fun)
    fun ViewPager2.autoScroll(lifecycleScope: LifecycleCoroutineScope, interval: Long) {
        lifecycleScope.launchWhenResumed{
            scrollIndefinitely(interval)
        }
    }
    private suspend fun ViewPager2.scrollIndefinitely(interval:Long){
        delay(interval)
        val numberOfItem = adapter?.itemCount ?:0
        val lastIndex = if (numberOfItem>0) numberOfItem-1 else 0
        val nextItem = if (currentItem==lastIndex) 0 else currentItem+1

        setCurrentItem(nextItem,true)
        scrollIndefinitely(interval)
    }


}