package com.jamesnyakush.carhub.ui.activity.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.ui.activity.auth.Auth
import com.jamesnyakush.carhub.ui.activity.main.MainActivity
import com.jamesnyakush.carhub.util.pref.SessionManager
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    private lateinit var sessionManager: SessionManager
    lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        sessionManager = SessionManager(applicationContext!!)

        supportActionBar!!.hide()

        val myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition)
        logo!!.startAnimation(myanim)
        dsc!!.startAnimation(myanim)

        i = if (!sessionManager.isFirstTime()){
            Intent(this, Auth::class.java)
        }else{
            Intent(this, MainActivity::class.java)
        }


        val timer = object : Thread() {
            override fun run() {
                try {
                    sleep(2000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    startActivity(i)
                    finish()
                }
            }
        }
        timer.start()
    }
}
