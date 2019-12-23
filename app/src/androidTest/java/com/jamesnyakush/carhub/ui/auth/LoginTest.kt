package com.jamesnyakush.carhub.ui.auth

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.jamesnyakush.carhub.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class LoginTest {
//    @get: Rule
//    val activityScenario = ActivityScenario.launch(Login::class.java)!!

    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(Login::class.java)
        onView(withId(R.id.login_layout)).check(matches(isDisplayed()))

    }

    @Test
    fun test_visibility_needAccount_loginButton() {
        val activityScenario = ActivityScenario.launch(Login::class.java)!!
        onView(withId(R.id.need_account)).check(matches(isDisplayed()))
        onView(withId(R.id.login)).check(matches(isDisplayed()))
    }

    @Test
    fun test_isNeedAccount_displayed() {
        val activityScenario = ActivityScenario.launch(Login::class.java)
        onView(withId(R.id.need_account)).check(matches(withText(R.string.need_an_account)))
    }

    @Test
    fun test_visibility_editTextEmail_editTextPassword() {
        val activityScenario = ActivityScenario.launch(Login::class.java)

        onView(withId(R.id.login_email)).check(matches(isDisplayed()))
        onView(withId(R.id.login_password)).check(matches(isDisplayed()))
    }
}