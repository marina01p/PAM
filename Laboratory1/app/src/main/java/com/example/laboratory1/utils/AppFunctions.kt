package com.example.laboratory1.utils

import java.text.SimpleDateFormat
import java.util.*

class AppFunctions {
    companion object {
        fun getCurrentDateTime(): Date {
            return Calendar.getInstance().time
        }

        fun getPosts() : MutableList<String> {
            return mutableListOf(
                    AppConstants.r_quote_01,
                    AppConstants.r_quote_02,
                    AppConstants.r_quote_03,
                    AppConstants.r_quote_04,
                    AppConstants.r_quote_05,
                    AppConstants.r_quote_06,
                    AppConstants.r_quote_07,
                    AppConstants.r_quote_08,
                    AppConstants.r_quote_09,
                    AppConstants.r_quote_10,
                    AppConstants.r_quote_11,
                    AppConstants.r_quote_12,
                    AppConstants.r_quote_13)
        }
    }
}