package com.jamesnyakush.carhub.util

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

fun Context.toast(msg: String) {
    Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).apply {
        show()
    }
}

fun View.snackbar(msg: String) {
    Snackbar.make(this, msg, Snackbar.LENGTH_LONG).also { snackbar ->
        snackbar.setAction("ok") {
            snackbar.dismiss()
        }
    }.show()
}