package com.example.laboratory1.network

import com.example.laboratory1.network.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}