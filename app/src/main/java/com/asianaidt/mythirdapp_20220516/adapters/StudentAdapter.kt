package com.asianaidt.mythirdapp_20220516.adapters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.asianaidt.mythirdapp_20220516.R
import com.asianaidt.mythirdapp_20220516.data.Student

class StudentAdapter(
    val mContext: Context,
    val mResId: Int,
    val mList: ArrayList<Student>) :
    ArrayAdapter<Student>(mContext, mResId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!! // 리스트 뷰의 한 줄에 해당하는 그림.
        return row
    }

}