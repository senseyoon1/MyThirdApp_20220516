package com.asianaidt.mythirdapp_20220516.data

class Estate(
    val price : Int,
    val address : String,
    val description : String,
    val floorInfo : Int) {

    fun getFloorInfo() : String {
        return when {
            floorInfo > 1 -> "${floorInfo}층"
            floorInfo == 0 -> "반지하"
            else -> "지하"
        }
    }

    fun convertPriceString() : String {
        return (
                (if(price > 10000) (this.price / 10000).toString() + "억 " else "") +
                        (if(price % 10000 != 0) "%,d".format(this.price % 10000L) else "")
        )
    }
}