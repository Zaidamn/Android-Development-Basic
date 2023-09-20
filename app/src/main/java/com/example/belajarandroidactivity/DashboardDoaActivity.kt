package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.Language

class DashboardDoaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val rvKumplanDoa: RecyclerView =
            findViewById(R.id.rvKumpulanDoa)
        val data = arrayListOf<Doa>(
            Doa("Dzikir dan Doa Sunnah Setelah SHolat", R.drawable.doa_harian2),
            Doa("Dzikir Harian", R.drawable.doa_harian2),
            Doa("Dzikir dan Doa Sunnah Setelah SHolat", R.drawable.doa_harian2),
            Doa("Dzikir Harian", R.drawable.doa_harian2),
            Doa("Dzikir dan Doa Sunnah Setelah SHolat", R.drawable.doa_harian2),
            Doa("Dzikir Harian", R.drawable.doa_harian2)
        )

        val cvSelengkapnya: CardView = findViewById(R.id.cvSelengkapnya)
        val adapter = DoaAdapter(data)

        rvKumplanDoa.adapter = adapter
        rvKumplanDoa.layoutManager =
            LinearLayoutManager ( this,
                LinearLayoutManager.VERTICAL, false)

        cvSelengkapnya.setOnClickListener {
            val intent = Intent(this, DoaHarianActivity::class.java)
            startActivity(intent)
        }

    }
}