package com.example.sometestswithgit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_two.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //supportFragmentManager
    }

    fun btnOneClick(view: View) {
        Toast.makeText(this, "Changing Fragment One Text", Toast.LENGTH_LONG).show()
        frag_one_textview.text = "Text Changed"

    }

    fun btnTwoClick(view: View) {
        Toast.makeText(this, "Changing Fragment Two Text", Toast.LENGTH_LONG).show()
        frag_two_textview.text = "Text Changed"

    }

}
