package com.asianaidt.mythirdapp_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.mythirdapp_20220516.adapters.StudentAdapter
import com.asianaidt.mythirdapp_20220516.data.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()
    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("윤종원",1985, "서울시 강서구"))
        mStudentList.add(Student("김배영영",1985,"서울시 강남구"))
        mStudentList.add(Student("송민규",1985, "서울시 강동구"))
        mStudentList.add(Student("유태수",1985, "서울시 강북구"))
        mStudentList.add(Student("양혜지",1985, "서울시 중구"))
        mStudentList.add(Student("방가희",1985, "서울시 동대문구"))
        mStudentList.add(Student("오하늬",1985, "서울시 서대문구"))
        mStudentList.add(Student("허성원",1985, "서울시 종로구"))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
        studentListView.adapter = mAdapter


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