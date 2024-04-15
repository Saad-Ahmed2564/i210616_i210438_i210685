package com.project.sfmd_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class BookAppointment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_book_appointment)

        val set = findViewById<Button>(R.id.set)
        set.setOnClickListener {
            val intent = Intent(this@BookAppointment, DoctorProfile::class.java)
            startActivity(intent)
        }

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this@BookAppointment, DoctorProfile::class.java)
            startActivity(intent)
        }

        val appointment = findViewById<Button>(R.id.appointment)
        appointment.setOnClickListener {
            val intent = Intent(this@BookAppointment, BookAppointment::class.java)
            startActivity(intent)
        }

        val record = findViewById<Button>(R.id.record)
        record.setOnClickListener {
            val intent = Intent(this@BookAppointment, Record::class.java)
            startActivity(intent)
        }

        val profile = findViewById<Button>(R.id.person)
        profile.setOnClickListener {
            val intent = Intent(this@BookAppointment, PatientProfile::class.java)
            startActivity(intent)
        }


        val home  = findViewById<Button>(R.id.home)
        home.setOnClickListener {
            val intent = Intent(this@BookAppointment, Home::class.java)
            startActivity(intent)
        }



    }
}