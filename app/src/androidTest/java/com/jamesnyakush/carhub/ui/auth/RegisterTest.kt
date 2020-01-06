package com.jamesnyakush.carhub.ui.auth

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.jamesnyakush.carhub.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class RegisterTest {

    @get: Rule
    val activityScenario = ActivityScenarioRule(Register::class.java)

    @Test
    fun test_IsViewDisplayed() {
        onView(withId(R.id.register_layout)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_hasAccount_registerBtn() {
        onView(withId(R.id.has_account)).check(matches(isDisplayed()))
        onView(withId(R.id.login_btn)).check(matches(isDisplayed()))
    }
}