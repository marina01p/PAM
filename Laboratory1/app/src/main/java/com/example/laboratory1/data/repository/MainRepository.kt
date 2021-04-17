package com.example.laboratory1.data.repository

import com.example.laboratory1.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}