package com.asianaidt.mythirdapp_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.coroutines.CoroutineContext

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
        btnVariable.setOnClickListener {
            var name1 : String = "String"
            val name2 : String = "String too"
        }
        btnCondition.setOnClickListener {
            val userAge = 18
            if(userAge > 20)
                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
            else if(userAge >= 17)
                Toast.makeText(this, "고등학생입니다.", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "중학생 이하입니다.", Toast.LENGTH_SHORT).show()

            val num = 30
            when(num){
                10 -> Log.d("when테스트","10인 경우")
                20 -> Log.d("when테스트","20인 경우")
                30 -> Log.d("when테스트","30인 경우")
            }

        }
        btnRepeat.setOnClickListener {
            val studentList = ArrayList<String>()
            studentList.add("홍길동")
            studentList.add("장길산")
            studentList.add("임꺽정")


            for(name in studentList)
                Log.d("for문", name)


            for(i in 0..4)
                Log.d("숫자", i.toString())
        }

        btnCopy.setOnClickListener {
            val message = edtMessage.text.toString()
            txtMessage.text = message
        }
    }
}