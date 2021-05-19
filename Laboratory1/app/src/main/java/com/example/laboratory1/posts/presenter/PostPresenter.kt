package com.example.laboratory1.posts.presenter

import com.example.laboratory1.posts.model.PostModel
import com.example.laboratory1.posts.view.PostView

class PostPresenter(private val postsView: PostView, private val postsModel: PostModel) {
    fun sendPosts() {
        postsView.postsView(postsModel.postToList())
    }
}