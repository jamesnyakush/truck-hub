package com.jamesnyakush.carhub.util.pref

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.jamesnyakush.carhub.util.Constants.IS_FIRST_TIME
import com.jamesnyakush.carhub.util.Constants.KEY_SAVED_AT
import com.jamesnyakush.carhub.util.Constants.PREF_NAME

class SessionManager(
    context: Context
) {
    private val appContext = context.applicationContext

    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    private val preference: SharedPreferences
        get() = PreferenceManager.getDefaultSharedPreferences(appContext)

    fun setNotFirstTime(isFirstTime: Boolean) {
        sharedPreferences.edit().putBoolean(IS_FIRST_TIME, isFirstTime).apply()
    }

    fun isFirstTime(): Boolean {
        return sharedPreferences.getBoolean(IS_FIRST_TIME, false)
    }

    fun savelastSavedAt(savedAt: String) {
        preference.edit().putString(
            KEY_SAVED_AT,
            savedAt
        ).apply()
    }

    fun getLastSavedAt(): String? {
        return preference.getString(KEY_SAVED_AT, null)
    }

}