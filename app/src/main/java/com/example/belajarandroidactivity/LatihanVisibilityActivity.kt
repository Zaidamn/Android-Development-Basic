package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)

        setContentView(R.layout.activity_latihan_visibility)
        val text: TextView = findViewById(R.id.tvText)
        val Buttom: Button = findViewById(R.id.btnclick)

        Buttom.setOnClickListener {
            if (text.visibility == View.VISIBLE) {
                text.visibility = View.INVISIBLE
            } else {
                text.visibility = View.VISIBLE
            }
        }
    }
}