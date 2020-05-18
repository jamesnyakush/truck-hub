package com.jamesnyakush.core

import android.app.AlertDialog
import android.content.Context
import android.view.View
import android.widget.Toast


fun Context.toast(msg: String) {
    Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).apply {
        show()
    }
}

//fun View.snackbar(msg: String) {
//    Snackbar.make(this, msg, Snackbar.LENGTH_LONG).also { snackbar ->
//        snackbar.setAction("ok") {
//            snackbar.dismiss()
//        }
//    }.show()
//}
//
//fun Context.alertdialog(msg: String) {
//    val alertDialog = AlertDialog.Builder(applicationContext)
//
//    alertDialog.setIcon(R.drawable.ic)
//        .setTitle("James")
//        .setMessage(msg)
//    alertDialog.show()
//}