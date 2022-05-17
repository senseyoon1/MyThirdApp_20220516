package com.asianaidt.mythirdapp_20220516

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_CODE_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener {
            val inputPhoneNumber = edtPhoneNumber.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNumber}")

            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        btnCall.setOnClickListener {
            val inputPhoneNumber = edtPhoneNumber.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNumber}")

            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }

    }

/*
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQ_CODE_NICKNAME){
            if (data != null) {
                txtNickname.text = data.getStringExtra("nickname")
            }
        }

    }
*/
}