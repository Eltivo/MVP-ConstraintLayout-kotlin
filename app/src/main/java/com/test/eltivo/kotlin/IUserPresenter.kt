package com.test.eltivo.kotlin

/**
 * Created by eltivo on 18-5-26.
 */
interface IUserPresenter {
    fun saveUser(id: Int, username: String, age: Int)
    fun loadUser(id: Int)
}