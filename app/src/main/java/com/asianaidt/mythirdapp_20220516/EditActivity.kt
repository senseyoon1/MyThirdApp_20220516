package com.asianaidt.mythirdapp_20220516

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.activity_main.*

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        btnOk.setOnClickListener {
            val inputNickname = edtNickname.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNickname)

            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}