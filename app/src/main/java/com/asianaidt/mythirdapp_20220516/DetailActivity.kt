package com.asianaidt.mythirdapp_20220516

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.mythirdapp_20220516.data.Estate
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val data = intent.getSerializableExtra("estate") as Estate

        description.text = data.description.toString()
        price.text = data.getPriceString()
        floorInfo.text = data.getFloorInfo()
    }
}