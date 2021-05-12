package com.example.laboratory1.navigation

import android.content.Context
import android.content.Intent
import com.example.laboratory1.*

class Navigator(private val context: Context) {

    fun openSecondActivity() {
        context.startActivity(Intent(context, SecondActivity::class.java))
    }

    fun openThirdActivity() {
        context.startActivity(Intent(context, ThirdActivity::class.java))
    }

    fun openFourthActivity() {
        context.startActivity(Intent(context, FourthActivity::class.java))
    }

    fun openFifthActivity() {
        context.startActivity(Intent(context, FifthActivity::class.java))
    }

    fun openSixthActivity() {
        context.startActivity(Intent(context, SixthActivity::class.java))
    }
}