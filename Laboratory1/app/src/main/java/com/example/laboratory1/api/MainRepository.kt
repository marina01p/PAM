package com.example.laboratory1.api

import com.example.laboratory1.api.model.User
import retrofit2.Response

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}