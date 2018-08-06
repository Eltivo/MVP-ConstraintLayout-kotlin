package com.test.eltivo.kotlin

/**
 * Created by eltivo on 18-5-26.
 */
interface IUserModel {
    fun setId(id: Int)
    fun setUsername(username: String)
    fun setAge(age: Int)
    fun save()
    fun load(id: Int): User
}