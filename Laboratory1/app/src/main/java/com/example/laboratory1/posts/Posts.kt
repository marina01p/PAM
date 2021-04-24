package com.example.laboratory1.posts

class Posts(titles: String?, details: String?, image: Int?, time: String?) {

    var titles: String? = titles
        get() = field.toString()
        set(value) { field = value.toString() }

    var details: String? = details
        get() = field.toString()
        set(value) { field = value.toString()}

    var image: Int? = image

    var time: String? = time
        get() = field.toString()
        set(value) { field = value.toString() }
}