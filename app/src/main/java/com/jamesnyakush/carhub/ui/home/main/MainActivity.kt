package com.jamesnyakush.carhub.ui.home.main

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.ui.home.about.About
import com.jamesnyakush.carhub.ui.home.settings.main.Settings
import com.jamesnyakush.carhub.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.main,
                R.id.payment_fragment,
                R.id.favourite_fragment,
                R.id.history_fragment
            )
        )


//        val navController = Navigation.findNavController(this, R.id.fragment)
        val navController = fragment.findNavController()
        NavigationUI.setupWithNavController(bottom, navController)
        NavigationUI.setupActionBarWithNavController(this, navController,appBarConfiguration)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.settings -> {
                startActivity(Intent(this, Settings::class.java))
                return true
            }
            R.id.about -> {
                startActivity(Intent(this, About::class.java))
                return true
            }
            R.id.logout -> {
                logout()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun logout() {
        val alertDialog = AlertDialog.Builder(this)

        alertDialog.setIcon(R.drawable.splash)
            .setTitle(getString(R.string.quit))
            .setMessage(R.string.logout_message)
            .setCancelable(true)
            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                toast("You Have Logged Out Successful")
            })
            .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
        alertDialog.show()
    }
}
