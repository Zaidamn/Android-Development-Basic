package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        val ArrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Python",
            "C++",
            "Java",
            "Go Lang",
            "JavaScript",
            "Ruby",
            "C#",
            "SQL Server",
            "MongoDB",
            "PostgreSql"
        )
        var mListView = findViewById<ListView>(R.id.lvBahasaPemrograman)
        ArrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)

        mListView.adapter = ArrayAdapter
    }
}