package com.l3ios.fragmentcommunicationusingrxjava.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.l3ios.fragmentcommunicationusingrxjava.adapter.SectionsPagerAdapter
import com.l3ios.fragmentcommunicationusingrxjava.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = SectionsPagerAdapter(this, supportFragmentManager)
        view_pager.adapter = adapter
        tabs.setupWithViewPager(view_pager)
    }
}
