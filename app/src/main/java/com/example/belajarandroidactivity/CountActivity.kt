package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val count_number: TextView = findViewById(R.id.tvNumber)
        val Count_Button: Button = findViewById(R.id.Count_Button)
        val Mines_Button: Button = findViewById(R.id.Mines_Button)
        val Reset_Button: Button = findViewById(R.id.Reset_Button)

        // setText = Untuk merubah atau mengisi text
        count_number.text = "0"
        // getText = Mengambil text
        println(count_number.text)
        Log.d("Number", "Angkanya Menjadi : ${count_number.text}")

        Count_Button.setOnClickListener {
            var countInt : Int = count_number.text.toString().toInt()

            countInt ++

            count_number.text = countInt.toString()

        }

        Mines_Button.setOnClickListener {
            var countInt : Int = count_number.text.toString().toInt()

            countInt --

            count_number.text = countInt.toString()

        }

        Reset_Button.setOnClickListener {
            var countInt : Int = count_number.text.toString().toInt()

            countInt = 0

            count_number.text = countInt.toString()

        }




    }
}