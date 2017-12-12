package com.migcavero.ankopractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout{

            val phoneNumberTextView = textView("(123)456-7890"){
                textSize = 24f
                gravity = Gravity.CENTER_HORIZONTAL
            }

            button("Send SMS") {
                onClick {
                    var phoneNumber: String = phoneNumberTextView.text.toString()
                    phoneNumber = "+1${phoneNumber.substring(1..3)}${phoneNumber.substring(5..7)}${phoneNumber.substring(9..12)}"
                    sendSMS("$phoneNumber", "Hello ${phoneNumberTextView.text}!!!")
                }
            }

        }
    }
}
