package com.project.sfmd_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatSearch : AppCompatActivity() , Chat_search_adapter.OnItemClickListener{

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<doctors>
    private lateinit var Name: Array<String>
    private lateinit var Type: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_chat_search)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val backIntent = Intent(this, Home::class.java)
            startActivity(backIntent)
        }

        newRecyclerView= findViewById(R.id.search)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)


        Name = arrayOf(
            "Dr.Charles Barkley",
            "Dr. Samantha Johnson",
            "Dr. Benjamin Lee",
            "Dr. Emily Rodriguez"
        )
        Type = arrayOf(
            "Dermatologist",
            "Cardiologist",
            "Neurologist",
            "Pediatrician"
            )

        newArrayList = arrayListOf<doctors>()
        getUserData()

    }

    private fun getUserData(){
        for(i in Name.indices){
            val docs = doctors(Name[i],Type[i])
            newArrayList.add(docs)
        }

        newRecyclerView.adapter = Chat_search_adapter(newArrayList, this)

    }

    override fun onItemClick(position: Int) {

        val intent = Intent(this, Chat::class.java)
        startActivity(intent)
    }
}