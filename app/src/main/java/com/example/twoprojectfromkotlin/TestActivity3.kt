package com.example.twoprojectfromkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public class TestActivity3 {

    class TestActivity2 : AppCompatActivity() {
        private var a = findViewById<TextView>(R.id.tvText0)
        private var b = findViewById<TextView>(R.id.tvText1)
        private var plus = findViewById<TextView>(R.id.tvSign)
        private var w = findViewById<TextView>(R.id.textMessage)
        private var answer = findViewById<TextView>(R.id.answer)
        private var check = findViewById<Button>(R.id.butCheck)

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_test2)

        }

        fun onClickCheck(view: View) {
            a.text = (10..99).random().toString()
            b.text = (10..99).random().toString()
            plus.text = "+"
            check.setOnClickListener {
                if ((a.text.toString() + b.text.toString()) == answer.text.toString()) {
                    w.text = "Congratulations"
                } else {
                    w.text = "Not today, broo"
                }
            }
        }
    }




}