package com.example.laboratory1.utils

import com.example.laboratory1.network.MainAdapter
import com.example.laboratory1.network.MainViewModel
import com.example.laboratory1.posts.RecycleAdapter
import com.example.laboratory1.posts.presenter.PostPresenter
import com.google.android.material.bottomnavigation.BottomNavigationView

object AppConstants {

    internal const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    internal lateinit var viewModel: MainViewModel
    internal lateinit var adapter: MainAdapter

    internal const val r_quote_01 = "A day without sunshine is like, you know, night.\n― Steve Martin ―"
    internal const val r_quote_02 = "That which does not kill us makes us stronger.\n― Friedrich Nietzsche ―"
    internal const val r_quote_03 = "If you judge people, you have no time to love them.\n― Mother Teresa ―"
    internal const val r_quote_04 = "We don't see things as they are, we see them as we are.\n― Anaïs Nin ―"
    internal const val r_quote_05 = "Sometimes the questions are complicated and the answers are simple.\n― Dr. Seuss ―"
    internal const val r_quote_06 = "You can never get a cup of tea large enough or a book long enough to suit me.\n― C.S. Lewis ―"
    internal const val r_quote_07 = "Some people never go crazy. What truly horrible lives they must lead.\n― Charles Bukowski ―"
    internal const val r_quote_08 = "Some infinities are bigger than other infinities.\n― John Green ―"
    internal const val r_quote_09 = "Never tell the truth to people who are not worthy of it.\n― Mark Twain ―"
    internal const val r_quote_10 = "A day without laughter is a day wasted.\n― Nicolas Chamfort ―"
    internal const val r_quote_11 = "Happiness in intelligent people is the rarest thing I know.\n― Ernest Hemingway ―"
    internal const val r_quote_12 = "I became insane, with long intervals of horrible sanity.\n― Edgar Allan Poe ―"
    internal const val r_quote_13 = "Never memorize something that you can look up.\n― Albert Einstein ―"

    internal const val r_user_name = "Cool name no. "
    internal const val r_user_name_01 = "Matthew"
    internal const val r_user_name_02 = "Scarlet"
    internal const val r_user_name_03 = "Jason"
    internal const val r_user_name_04 = "Eleanor"
    internal const val r_user_name_05 = "Frederick"

    internal const val r_user_quote = "To lazy to write quote no. "
    internal const val r_user_quote_01 = "To be, or not to be, that is the question."
    internal const val r_user_quote_02 = "You only live once, but if you do it right, once is enough."
    internal const val r_user_quote_03 = "I have not failed. I've just found 10,000 ways that won't work."
    internal const val r_user_quote_04 = "If you tell the truth, you don't have to remember anything."
    internal const val r_user_quote_05 = "We accept the love we think we deserve"

    internal const val r_post_time = "11:10 | 01/01"
    internal const val r_post_time_01 = "12:21 | 01/03"
    internal const val r_post_time_02 = "14:14 | 25/02"
    internal const val r_post_time_03 = "15:01 | 21/02"
    internal const val r_post_time_04 = "14:32 | 15/02"
    internal const val r_post_time_05 = "17:15 | 05/01"
}