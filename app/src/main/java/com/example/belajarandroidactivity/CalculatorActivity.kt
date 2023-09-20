package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val btntambah: Button = findViewById(R.id.Button_tambah)
        val btnkurang: Button = findViewById(R.id.Button_kurang)
        val btnkali: Button = findViewById(R.id.Button_Kali)
        val btnbagi: Button = findViewById(R.id.Button_Bagi)
        val btnpersen: Button = findViewById(R.id.Button_persen)
        val btnclear: Button = findViewById(R.id.Button_Clear)

        var inputangka1: EditText = findViewById(R.id.Input_Angka_1)
        var inputangka2: EditText = findViewById(R.id.Input_Angka_2)
        var hasil: TextView = findViewById (R.id.Hasil)

        val builder: AlertDialog.Builder = AlertDialog.Builder (this@CalculatorActivity)

        btntambah.setOnClickListener {
            var angka1: Int = inputangka1.text.toString().toInt()
            var angka2: Int = inputangka2.text.toString().toInt()

            var hasiltambah:Int = angka1 + angka2

            hasil.setText(hasiltambah.toString())
        }

        btnkurang.setOnClickListener {
            var angka1: Int = inputangka1.text.toString().toInt()
            var angka2: Int = inputangka2.text.toString().toInt()

            var hasilkurang:Int = angka1 - angka2

            hasil.setText(hasilkurang.toString())
        }

        btnkali.setOnClickListener {
            var angka1: Int = inputangka1.text.toString().toInt()
            var angka2: Int = inputangka2.text.toString().toInt()

            var hasilkali:Int = angka1 * angka2

            hasil.setText(hasilkali.toString())
        }

        btnbagi.setOnClickListener {
            var angka1: Int = inputangka1.text.toString().toInt()
            var angka2: Int = inputangka2.text.toString().toInt()

            var hasilbagi:Int = angka1 / angka2

            hasil.setText(hasilbagi.toString())
        }

        btnpersen.setOnClickListener {
            var angka1: Int = inputangka1.text.toString().toInt()
            var angka2: Int = inputangka2.text.toString().toInt()

            var hasilpersen:Int = angka1 % angka2

            hasil.setText(hasilpersen.toString())
        }

        btnclear.setOnClickListener {

            var hasilclear: Int = hasil.text.toString().toInt()

            builder.setTitle("Perhatian !")
            builder.setMessage("Kamu Yakin Mau Menghapus Datanya?")
            builder.setCancelable(false)

            // Postitive (Example is yes)
            builder.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, which ->
                hasilclear = 0
                inputangka1.setText("")
                inputangka2.setText("")

                hasil.setText(hasilclear.toString())
            })
            // Nigative (Example is no)
            builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->

            })
            // icon
            builder.setIcon(R.drawable.ingfo_img)

            val alertdialog: AlertDialog = builder.create()
            alertdialog.show()


            hasil.setText(hasilclear.toString())
        }





    }
}