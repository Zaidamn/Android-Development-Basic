package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibcall: ImageButton? = null
    var ibnavigate: ImageButton? = null
    var ibshare: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibcall = findViewById(R.id.ibcall)
        ibnavigate = findViewById(R.id.ibnavigate)
        ibshare = findViewById(R.id.ibshare)

        ibcall!!.setOnClickListener {
            val phone_number = "0112324112"
            val phone_intent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phone_number"))
            startActivity(phone_intent)
        }

        ibnavigate!!.setOnClickListener {
            val mapintent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:46.69362108150422, 12.084812643231292"))
            mapintent.setPackage("com.google.android.apps.maps")
            startActivity(mapintent)

        }
    }
}