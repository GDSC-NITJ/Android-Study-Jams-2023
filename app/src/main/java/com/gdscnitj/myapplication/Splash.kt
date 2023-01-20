package com.gdscnitj.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed
import com.google.firebase.auth.FirebaseAuth

class Splash : AppCompatActivity()
{
    private lateinit var mAuth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mAuth = FirebaseAuth.getInstance()
        val user = mAuth.currentUser

        if (user != null) {

            Handler().postDelayed(
                {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }, 2000)
        }
        else {
            Handler().postDelayed(
                {
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }, 2500)
        }
    }
}