package com.example.laboratory1.testing

import com.example.laboratory1.utils.AppConstants.loginEmail

object LoginUtil {

    fun validateLoginInput(
        email: String,
        password: String): Boolean {

        if(email.isEmpty() || password.isEmpty()) {
            return false
        }

        if(email == loginEmail) {
            return false
        }

        if(password.length < 6) {
            return false
        }
        return true
    }
}