package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnpindah: Button = findViewById(R.id.btnPindah)
        val btnshare: Button = findViewById(R.id.btnShare)

        btnpindah.setOnClickListener {

            val intent = Intent (this, DetailActivity::class.java)

            startActivity(intent)
        }

        btnshare.setOnClickListener {

            val intent = Intent (Intent.ACTION_SEND)

            intent.putExtra(Intent.EXTRA_TIME, "Hallo saya share ke sosial media")
            intent.setType("text/plain")

            startActivity(Intent.createChooser(intent, "Share to:"))
        }
    }
}