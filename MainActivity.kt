package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val Key_1 = "name"
const val Key_2= "age"
const val Key_3= "isStudent"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            //we are using two parameter constructor of intent
            val i = Intent(this,MainActivity2::class.java)
            i.putExtra(Key_1,"harsh aggarwal")
            i.putExtra(Key_2,22)
            i.putExtra(Key_3,true)
            startActivity(i)

        }
        mail_btn.setOnClickListener {
            val email = editTextBar.text.toString()
            val i= Intent()
            i.action = Intent.ACTION_SENDTO
            i.data = Uri.parse("mailto:$email")
            i.putExtra(Intent.EXTRA_SUBJECT,"Implicit Intents")
            startActivity(i)
        }


        browse_btn.setOnClickListener {
            val address= editTextBar.text.toString()
            val i= Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$address")
            startActivity(i)
        }
        dial_btn.setOnClickListener {
            val mobile= editTextBar.text.toString()
            val i= Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:$mobile")
            startActivity(i)
        }
    }


}