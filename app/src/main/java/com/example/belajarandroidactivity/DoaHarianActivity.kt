package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian: RecyclerView =
            findViewById(R.id.rvDoaHarian)
        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Sebelum Makan", "للّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ", "Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sesudah Makan", "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَِ", "Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin"),
            DoaHarian("Doa Sebelum Tidur", "بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتَُِ", "Bismikallohumma ahya wa amuutu"),
            DoaHarian("Doa Ketika Mimpi Buruk", "اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمَُِِ", "Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami"),
            DoaHarian("Doa Ketika Mendapat Mimpi Baik", "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ", "Alhamdulillahil ladzii qodzoo haajaati")
        )

        val ibKembaliKeDashboardDoa: ImageButton = findViewById(R.id.ibKembaliKeDashboardDoa)
        val adapter = DoaHarianAdapter(data)

        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager =
            LinearLayoutManager ( this,
                LinearLayoutManager.VERTICAL, false)

        ibKembaliKeDashboardDoa.setOnClickListener {
            val Back = Intent(this, DashboardDoaActivity::class.java)
            startActivity(Back)
        }
    }
}