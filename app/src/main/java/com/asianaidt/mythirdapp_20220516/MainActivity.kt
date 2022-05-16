package com.asianaidt.mythirdapp_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLog.setOnClickListener {  
            Log.d("로그태그", "로그메시지")
        }
        btnLog.setOnLongClickListener {
            Log.d("로그태그", "로그메시지 ")
            return@setOnLongClickListener true
        }
        btnToast.setOnClickListener {
            Toast.makeText(this, "wow", Toast.LENGTH_SHORT).show()
        }
    }
}