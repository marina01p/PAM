package com.example.laboratory1.login

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.laboratory1.R
import org.junit.Test

class LoginActivityTest{

    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(LoginActivity::class.java)
        onView(withId(R.id.login)).check(matches(isDisplayed()))
    }

    @Test
    fun email_inputInView() {
        val activityScenario = ActivityScenario.launch(LoginActivity::class.java)
        onView(withId(R.id.input_email)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.input_password)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.input_button)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

}