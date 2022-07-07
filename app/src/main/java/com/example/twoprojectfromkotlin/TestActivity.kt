package com.example.twoprojectfromkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }
    fun onClickPlay(view : View) {
        val intent = Intent(this, TestActivity3::class.java)
        startActivity(intent)
    }
    fun onClickBack(view : View) {
        finish()
    }

}