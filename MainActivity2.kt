package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name= intent.getStringExtra(Key_1)
        val age= intent.getIntExtra(Key_2,0)
        val isStudent= intent.getBooleanExtra(Key_3,false)
        textView.text= "name:$name  age:$age isStudent:$isStudent"
    }
}