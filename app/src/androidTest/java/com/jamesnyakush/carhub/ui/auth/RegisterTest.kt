package com.jamesnyakush.carhub.ui.auth

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.jamesnyakush.carhub.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class RegisterTest {

    @Test
    fun test_IsViewDisplayed() {
        val activityScenario = ActivityScenario.launch(Register::class.java)

        onView(withId(R.id.register_layout)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_hasAccount_registerBtn() {
        val activityScenario = ActivityScenario.launch(Register::class.java)

        onView(withId(R.id.has_account)).check(matches(isDisplayed()))
        onView(withId(R.id.login_btn)).check(matches(isDisplayed()))
    }
}