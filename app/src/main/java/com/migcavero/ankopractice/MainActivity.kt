package com.migcavero.ankopractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sendSMS

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_button.setOnClickListener{
            var phoneNumber: String = phone_text_view.text.toString()
            phoneNumber = "+1${phoneNumber.substring(1..3)}${phoneNumber.substring(5..7)}${phoneNumber.substring(9..12)}"
            sendSMS("$phoneNumber", "Hello +1${phone_text_view.text}!!!")
        }
    }
}
