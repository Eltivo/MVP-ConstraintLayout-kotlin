package com.test.eltivo.kotlin

/**
 * Created by eltivo on 18-5-26.
 */
interface IUserView {
    fun getID(): Int
    fun getUsername(): String
    fun getAge(): Int
    fun setUsername(username: String)
    fun setAge(age: Int)
    fun onSaveSuccess()
}