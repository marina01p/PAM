package com.example.laboratory1.data.api

import com.example.laboratory1.data.model.Posts
import com.example.laboratory1.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

    @GET("posts")
    suspend fun getPosts(): List<Posts>
}