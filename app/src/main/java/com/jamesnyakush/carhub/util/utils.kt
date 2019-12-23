package com.jamesnyakush.carhub.util

import android.app.AlertDialog
import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar
import com.jamesnyakush.carhub.R

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
fun Context.alertdialog(msg: String){
    val alertDialog = AlertDialog.Builder(applicationContext)

    alertDialog.setIcon(R.drawable.ic_history)
        .setTitle(R.string.app_name)
        .setMessage(msg)
    alertDialog.show()
}
