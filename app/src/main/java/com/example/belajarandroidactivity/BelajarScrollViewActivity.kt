package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity() {
    var ivbg: ImageView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)

        ivbg = findViewById(R.id.ivorvbg)

        Glide.with(this)
            .load(R.drawable.orv_bg_1)
            .transform(BlurTransformation(25,3))
            .into(ivbg!!)
    }
}