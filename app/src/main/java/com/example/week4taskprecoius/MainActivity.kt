package com.example.week4taskprecoius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.microsoftteamsimage1,
            R.drawable.microsoftteamsimage2,
            R.drawable.microsofteamsimage3,
            R.drawable.microsoftteamsimage4,
            R.drawable.microsoftteamsimage6,
            R.drawable.microsofteamsimage7,
            R.drawable.microsoftteamsimage8png,
            R.drawable.microsofteamsimage9,


            )
        val viewPager:ViewPager2= findViewById<ViewPager2>(R.id.viewImage)


        val adapter = ViewPagerAdapter(images)

        viewPager.adapter = adapter
    }

}