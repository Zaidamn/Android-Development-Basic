package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val judulform: TextView = findViewById(R.id.judulform)
        val labelnama: TextView = findViewById(R.id.labelname)
        val labelkelas: TextView = findViewById(R.id.labelkelas)
        val labelkodebuku: TextView = findViewById(R.id.labelkodebuku)

        val inputnama: EditText = findViewById(R.id.inputname)
        val inputkelas: EditText = findViewById(R.id.inputkelas)
        val inputkodebuku: EditText = findViewById(R.id.inputkodebuku)

        val buttonsubmit: Button = findViewById(R.id.buttonsubmit)

        val shownama: TextView = findViewById(R.id.showname)
        val showkelas: TextView = findViewById(R.id.showkelas)
        val showbook: TextView = findViewById(R.id.showbook)



        buttonsubmit.setOnClickListener {

            shownama.text = inputnama.text
            showkelas.text = inputkelas.text

            val kode: Int = inputkodebuku.text.toString().toInt()


            when (kode) {
                123 -> showbook.text = "Harry Potter"
                456 -> showbook.text = "ALice in Worderland"
                789 -> showbook.text = "Omniscient Reader Viewpoint"
                else -> showbook.text = "Buku Tidak Ditemukan"
            }

            Toast.makeText(this, "Anda Meminjam Buku ${showbook.text}",
                Toast.LENGTH_SHORT).show()
        }
    }
}