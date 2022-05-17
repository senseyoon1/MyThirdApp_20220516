package com.asianaidt.mythirdapp_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.mythirdapp_20220516.adapters.EstateAdapter
import com.asianaidt.mythirdapp_20220516.data.Estate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mEstateList = ArrayList<Estate>()
    lateinit var mAdapter : EstateAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mEstateList.add(Estate(150000,"서울시 서초구 서초동", "떨이", -2))
        mEstateList.add(Estate(1500,"서울시 서초구 서초동", "떨이", -1))
        mEstateList.add(Estate(15000,"서울시 서초구 서초동", "떨이", 0))
        mEstateList.add(Estate(150000,"서울시 서초구 서초동", "떨이", 2))
        mEstateList.add(Estate(150000,"서울시 서초구 서초동", "떨이", 1))
        mEstateList.add(Estate(150000,"서울시 서초구 서초동", "떨이", 16))

        mAdapter = EstateAdapter(this, R.layout.estate_list_item, mEstateList)
        estateListView.adapter = mAdapter


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