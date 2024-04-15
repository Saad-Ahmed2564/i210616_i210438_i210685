package com.project.sfmd_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_chat)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val backIntent = Intent(this, ChatSearch::class.java)
            startActivity(backIntent)
        }

        val call = findViewById<Button>(R.id.call)
        call.setOnClickListener {
            val backIntent = Intent(this,  Call::class.java)
            startActivity(backIntent)
        }


        val video = findViewById<Button>(R.id.video)
        video.setOnClickListener {
            val backIntent = Intent(this,  Video::class.java)
            startActivity(backIntent)
        }


    }
}