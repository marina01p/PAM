@file:Suppress("UNCHECKED_CAST")

package com.example.laboratory1.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.laboratory1.data.api.ApiHelper
import com.example.laboratory1.data.repository.MainRepository
import com.example.laboratory1.ui.main.viewmodel.PostsViewModel

class ViewModelFactory1(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostsViewModel::class.java)) {
            return PostsViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}