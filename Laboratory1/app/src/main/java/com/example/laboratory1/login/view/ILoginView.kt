package com.example.laboratory1.login.view

interface ILoginView {
    fun onLoginSuccess(message: String)
    fun onLoginFail(message: String)
}