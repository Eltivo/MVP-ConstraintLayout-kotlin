package com.test.eltivo.kotlin

import android.util.SparseArray

/**
 * Created by eltivo on 18-5-26.
 */
class UserModel: IUserModel {
    private var mId: Int = 0
    private var mUsername: String = ""
    private var mAge: Int = 0
    private var mUserArray = SparseArray<User>()

    override fun setId(id: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        mId = id
    }

    override fun setUsername(username: String) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        mUsername = username
    }

    override fun setAge(age: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        mAge = age
    }

    override fun save() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        mUserArray.append(mId, User(mUsername, mAge))
    }

    override fun load(id: Int): User {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        mId = id
        return mUserArray.get(mId, User("not found", 0))
    }

}