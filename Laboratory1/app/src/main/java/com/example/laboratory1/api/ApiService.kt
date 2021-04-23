package com.example.laboratory1.api

import com.example.laboratory1.api.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}