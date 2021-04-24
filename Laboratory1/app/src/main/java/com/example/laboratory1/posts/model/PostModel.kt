package com.example.laboratory1.posts.model

import com.example.laboratory1.R
import com.example.laboratory1.posts.Posts
import com.example.laboratory1.utils.AppConstants.r_post_time
import com.example.laboratory1.utils.AppConstants.r_post_time_01
import com.example.laboratory1.utils.AppConstants.r_post_time_02
import com.example.laboratory1.utils.AppConstants.r_post_time_03
import com.example.laboratory1.utils.AppConstants.r_post_time_04
import com.example.laboratory1.utils.AppConstants.r_post_time_05
import com.example.laboratory1.utils.AppConstants.r_user_name
import com.example.laboratory1.utils.AppConstants.r_user_name_01
import com.example.laboratory1.utils.AppConstants.r_user_name_02
import com.example.laboratory1.utils.AppConstants.r_user_name_03
import com.example.laboratory1.utils.AppConstants.r_user_name_04
import com.example.laboratory1.utils.AppConstants.r_user_name_05
import com.example.laboratory1.utils.AppConstants.r_user_quote
import com.example.laboratory1.utils.AppConstants.r_user_quote_01
import com.example.laboratory1.utils.AppConstants.r_user_quote_02
import com.example.laboratory1.utils.AppConstants.r_user_quote_03
import com.example.laboratory1.utils.AppConstants.r_user_quote_04
import com.example.laboratory1.utils.AppConstants.r_user_quote_05

import kotlin.collections.ArrayList

class PostModel{
    private val postsList = ArrayList<Posts>()
    fun postToList(): ArrayList<Posts> {
        val post1 = Posts(r_user_name_01, r_user_quote_01,  R.drawable.post_image_01, r_post_time_01)
        postsList.add(post1)
        val post2 = Posts(r_user_name_02, r_user_quote_02, R.drawable.post_image_02, r_post_time_02)
        postsList.add(post2)
        val post3 = Posts(r_user_name_03, r_user_quote_03, R.drawable.post_image_03, r_post_time_03)
        postsList.add(post3)
        val post4 = Posts(r_user_name_04, r_user_quote_04, R.drawable.post_image_04, r_post_time_04)
        postsList.add(post4)
        val post5 = Posts(r_user_name_05, r_user_quote_05, R.drawable.post_image_06, r_post_time_05)
        postsList.add(post5)
        for (i in 7..30) {
            val postInfinite = Posts(r_user_name + "$i", r_user_quote, R.drawable.post_image_06, r_post_time)
            postsList.add(postInfinite)
        }
        return postsList
    }
}
