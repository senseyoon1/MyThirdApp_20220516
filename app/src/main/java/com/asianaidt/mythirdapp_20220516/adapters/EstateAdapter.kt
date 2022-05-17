package com.asianaidt.mythirdapp_20220516.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.asianaidt.mythirdapp_20220516.R
import com.asianaidt.mythirdapp_20220516.data.Estate

class EstateAdapter(
    val mContext: Context,
    val mResId: Int,
    val mList: ArrayList<Estate>) :
    ArrayAdapter<Estate>(mContext, mResId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.estate_list_item, null)
        }

        val data = mList[position]
        val row = tempRow!! // 리스트 뷰의 한 줄에 해당하는 그림.

        val txtPrice = row.findViewById<TextView>(R.id.price)
        val txtAddress = row.findViewById<TextView>(R.id.address)
        val txtDescription = row.findViewById<TextView>(R.id.description)
        val txtFloorInfo = row.findViewById<TextView>(R.id.floorInfo)

        txtPrice.text = data.convertPriceString()
        txtFloorInfo.text = data.getFloorInfo()
        txtAddress.text = data.address
        txtDescription.text = data.description

        return row
    }

}