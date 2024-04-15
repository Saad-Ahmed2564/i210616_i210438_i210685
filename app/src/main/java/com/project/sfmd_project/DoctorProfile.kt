package com.project.sfmd_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class DoctorProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams


        setContentView(R.layout.activity_doctor_profile)

        val appointment = findViewById<Button>(R.id.appointment)
        appointment.setOnClickListener {
            val intent = Intent(this@DoctorProfile, BookAppointment::class.java)
            startActivity(intent)
        }

        val record = findViewById<Button>(R.id.record)
        record.setOnClickListener {
            val intent = Intent(this@DoctorProfile, Record::class.java)
            startActivity(intent)
        }

        val profile = findViewById<Button>(R.id.person)
        profile.setOnClickListener {
            val intent = Intent(this@DoctorProfile, PatientProfile::class.java)
            startActivity(intent)
        }

        val home  = findViewById<Button>(R.id.home)
        home.setOnClickListener {
            val intent = Intent(this@DoctorProfile, Home::class.java)
            startActivity(intent)
        }

        val set  = findViewById<Button>(R.id.set)
        set.setOnClickListener {
            val intent = Intent(this@DoctorProfile, BookAppointment::class.java)
            startActivity(intent)
        }

        val quali  = findViewById<Button>(R.id.quali)
        quali.setOnClickListener {
            val intent = Intent(this@DoctorProfile, Qualification::class.java)
            startActivity(intent)
        }

        val rev  = findViewById<Button>(R.id.rev)
        rev.setOnClickListener {
            val intent = Intent(this@DoctorProfile, Reviews::class.java)
            startActivity(intent)
        }

        val work  = findViewById<Button>(R.id.work)
        work.setOnClickListener {
            val intent = Intent(this@DoctorProfile, WorkExperience::class.java)
            startActivity(intent)
        }






    }
}