package com.asianaidt.mythirdapp_20220516.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.asianaidt.mythirdapp_20220516.data.Student

class StudentAdapter(
    val mContext: Context,
    val mResId: Int,
    val mList: ArrayList<Student>) :
    ArrayAdapter<Student>(mContext, mResId, mList) {

}