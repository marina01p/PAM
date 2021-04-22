package com.example.laboratory1.data.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
    suspend fun getPosts() = apiService.getPosts()
}