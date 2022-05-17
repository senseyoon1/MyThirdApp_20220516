package com.asianaidt.mythirdapp_20220516

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.mythirdapp_20220516.data.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_CODE_NICKNAME = 1000
    val mStudent = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudent.add(Student("윤종원",1985, "서울시 강서구"))
        mStudent.add(Student("김배영영",1985,"서울시 강남구"))
        mStudent.add(Student("송민규",1985, "서울시 강동구"))
        mStudent.add(Student("유태수",1985, "서울시 강북구"))
        mStudent.add(Student("양혜지",1985, "서울시 중구"))
        mStudent.add(Student("방가희",1985, "서울시 동대문구"))
        mStudent.add(Student("오하늬",1985, "서울시 서대문구"))
        mStudent.add(Student("허성원",1985, "서울시 종로구"))

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