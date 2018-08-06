package com.test.eltivo.kotlin

import android.util.Log

/**
 * Created by eltivo on 18-5-26.
 */
class UserPresenter(val view: IUserView): IUserPresenter {
    private val mUserModel: UserModel = UserModel()

    override fun saveUser(id: Int, username: String, age: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.d("eltivo", "save user: $id, $username, $age")
        mUserModel.setId(id)
        mUserModel.setUsername(username)
        mUserModel.setAge(age)
        mUserModel.save()
        view.onSaveSuccess()
    }

    override fun loadUser(id: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val user = mUserModel.load(id)
        Log.d("eltivo", "save user: $id, ${user.userName}, ${user.age}")
        view.setUsername(user.userName)
        view.setAge(user.age)
    }

}