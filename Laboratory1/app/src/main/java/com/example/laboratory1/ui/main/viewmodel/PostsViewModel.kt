package com.example.laboratory1.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.laboratory1.data.repository.MainRepository
import com.example.laboratory1.utils.Resource
import kotlinx.coroutines.Dispatchers

class PostsViewModel(private val postsRepository: MainRepository) : ViewModel() {

    fun getPosts() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = postsRepository.getPosts()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}