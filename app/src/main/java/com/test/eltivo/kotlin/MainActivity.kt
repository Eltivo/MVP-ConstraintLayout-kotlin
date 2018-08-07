package com.test.eltivo.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IUserView, View.OnClickListener {
    private var mUserPresenter: UserPresenter ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mUserPresenter = UserPresenter(this)
        button.setOnClickListener(this)
        button2.setOnClickListener(this)
    }

    override fun getID(): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val id = editText.text.toString().trim()
        return if(id.isNotEmpty()) id.toInt() else 0
    }

    override fun getUsername(): String = editText2.text.toString().trim()

    override fun getAge(): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val age = editText3.text.toString().trim()
        return if(age.isNotEmpty()) age.toInt() else 0
    }

    override fun setUsername(username: String) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        editText2.text = Editable.Factory().newEditable(username)
    }

    override fun setAge(age: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        editText3.text = Editable.Factory().newEditable(age.toString())
    }

    override fun onSaveSuccess() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        editText.setText("")
        editText2.setText("")
        editText3.setText("")
        Toast.makeText(this, "save done", Toast.LENGTH_LONG).show()
    }

    override fun onClick(v: View?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when(v?.id) {
            R.id.button -> mUserPresenter?.saveUser(getID(), getUsername(), getAge())
            R.id.button2 -> mUserPresenter?.loadUser(getID())
        }
    }
    
}
