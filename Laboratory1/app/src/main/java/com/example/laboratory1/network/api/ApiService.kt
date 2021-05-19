package com.example.laboratory1.network.api

import com.example.laboratory1.network.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}