package com.project.sfmd_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Home : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams


        setContentView(R.layout.activity_home)

        val specialisation = findViewById<Button>(R.id.speacializations)
        specialisation.setOnClickListener {
            val intent = Intent(this@Home, Speacial::class.java)
            startActivity(intent)
        }

        val articles = findViewById<Button>(R.id.articles)
        articles.setOnClickListener {
            val intent = Intent(this@Home, Articles::class.java)
            startActivity(intent)
        }


        val appointment = findViewById<Button>(R.id.appointment)
        appointment.setOnClickListener {
            val intent = Intent(this@Home, Appointment::class.java)
            startActivity(intent)
        }

        val record = findViewById<Button>(R.id.record)
        record.setOnClickListener {
            val intent = Intent(this@Home, Record::class.java)
            startActivity(intent)
        }

        val profile = findViewById<Button>(R.id.person)
        profile.setOnClickListener {
            val intent = Intent(this@Home, PatientProfile::class.java)
            startActivity(intent)
        }

        val home  = findViewById<Button>(R.id.home)
        home.setOnClickListener {
            val intent = Intent(this@Home, Home::class.java)
            startActivity(intent)
        }


        val navView : NavigationView = findViewById(R.id.nav)
        val logoutButton = navView.getHeaderView(0).findViewById<Button>(R.id.logout)
        logoutButton.setOnClickListener {
            val intent = Intent(this@Home, Login::class.java)
            startActivity(intent)
            finish()
        }
        val chat = navView.getHeaderView(0).findViewById<Button>(R.id.chatbtn)
        chat.setOnClickListener {
            val intent = Intent(this@Home, ChatSearch::class.java)
            startActivity(intent)
            finish()
        }
        val search = navView.getHeaderView(0).findViewById<Button>(R.id.searchbtn)
        search.setOnClickListener {
            val intent = Intent(this@Home, Search::class.java)
            startActivity(intent)
            finish()
        }

        val doctor = findViewById<View>(R.id.doctor)
        doctor.setOnClickListener {
            val intent = Intent(this@Home, DoctorProfile::class.java)
            startActivity(intent)
        }



        drawerLayout = findViewById(R.id.sidebar)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)





    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun toggleDrawer(view: View) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }



}