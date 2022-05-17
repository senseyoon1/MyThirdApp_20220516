package com.asianaidt.mythirdapp_20220516.data

class Student(
    val name : String,
    val birthYear : Int,
    val address : String) {

    fun getKoreanAge() = 2022 - this.birthYear + 1
}