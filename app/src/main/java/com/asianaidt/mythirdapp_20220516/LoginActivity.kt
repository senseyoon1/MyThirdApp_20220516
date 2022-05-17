package com.asianaidt.mythirdapp_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        
        val id = "senseyoon"
        val password = "1234"
        
        btnSubmit.setOnClickListener { 
            if(!edtId.text.toString().equals(id))
                Toast.makeText(this, "로그인 정보를 확인하세요.", Toast.LENGTH_SHORT).show()

            if(!edtPassword.text.toString().equals(password))
                Toast.makeText(this, "로그인 정보를 확인하세요.", Toast.LENGTH_SHORT).show()

            Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
        }
    }
}