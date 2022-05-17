package com.asianaidt.mythirdapp_20220516.adapters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

        val data = mList[position]
        val row = tempRow!! // 리스트 뷰의 한 줄에 해당하는 그림.

        val txtName = row.findViewById<TextView>(R.id.studentName)
        val txtAge = row.findViewById<TextView>(R.id.studentAge)
        val txtAddress = row.findViewById<TextView>(R.id.studentAddress)

        txtName.text = data.name
        txtAge.text = (2022-data.birthYear+1).toString()
        txtAddress.text = data.address

        return row
    }

}