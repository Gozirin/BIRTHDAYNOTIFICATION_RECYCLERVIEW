package com.example.week4taskprecoius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    val names : List<String> = listOf("Ola Machiavelli", "Samuel Garfied", "Kome Holmes","Omolade Rogers")
    val pictures : List<Int> = listOf(
        R.drawable.component1,
        R.drawable.component2,
        R.drawable.component3,
        R.drawable.component4
    )

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

        var cardItemAdapter = Carditems()
        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = cardItemAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

//        LinearLayoutManager layoutManager
//        = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//
//        RecyclerView myItems = findViewById(R.id.my_recycler_view);
//        myItems.setLayoutManager(layoutManager);


    }

}

