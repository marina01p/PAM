package com.example.laboratory1.login.model

interface ILoginModel {
    val email: String
    val password: String
    fun isDataValid(): Int
}