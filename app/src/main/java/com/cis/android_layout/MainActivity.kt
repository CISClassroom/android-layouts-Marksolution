package com.cis.android_layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_constran.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button3.setOnClickListener {
            val i = Intent(this, ConstranActivity::class.java)
            startActivity(i)
        }
        button.setOnClickListener {
            val i = Intent(this, LinearActivity::class.java)
            startActivity(i)
        }
        button2.setOnClickListener {
            val i = Intent(this, RelativeActivity::class.java)
            startActivity(i)
        }

    }
}
