package com.project.sfmd_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import com.google.android.material.navigation.NavigationView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_sign_up)


        val docSignUp = findViewById<Button>(R.id.button_1)
        docSignUp.setOnClickListener {
            val intent = Intent(this, DoctorSignUp::class.java)
            startActivity(intent)
        }


        val patSignUp = findViewById<Button>(R.id.button_2)
        patSignUp.setOnClickListener {
            val intent = Intent(this, PatientSignUp::class.java)
            startActivity(intent)
        }




    }
}