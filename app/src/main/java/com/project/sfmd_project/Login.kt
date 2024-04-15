package com.project.sfmd_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams


        setContentView(R.layout.activity_login)

        val login = findViewById<Button>(R.id.button2)
        login.setOnClickListener {
            val loginIntent = Intent(this, Home::class.java)
            startActivity(loginIntent)
        }


        val forgot = findViewById<TextView>(R.id.textView2)
        forgot.setOnClickListener {
            val forgotIntent = Intent(this, ForgotPassword::class.java)
            startActivity(forgotIntent)
        }

        val signup = findViewById<Button>(R.id.button)
        signup.setOnClickListener {
            val signupIntent = Intent(this, SignUp::class.java)
            startActivity(signupIntent)
        }
    }
}