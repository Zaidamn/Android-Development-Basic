package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

        // Use ArrayAdapter and Define an Array
        val ArrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Steve Smith", "Tom taylor", "Matthias Chris"
        )
        // Access the Listview from xml file
        var mListView = findViewById<ListView>(R.id.lvNama)
        // Panggil object ArrayAdapter
        ArrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        // Isi Adapter
        mListView.adapter = ArrayAdapter
    }
}