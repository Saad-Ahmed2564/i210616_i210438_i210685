package com.project.sfmd_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class FamilyDiseases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams
        setContentView(R.layout.activity_family_diseases)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this@FamilyDiseases, PatientProfile::class.java)
            startActivity(intent)
        }
        val plus = findViewById<Button>(R.id.plus)
        plus.setOnClickListener {
            val intent = Intent(this@FamilyDiseases, Add::class.java)
            startActivity(intent)
        }

    }
}