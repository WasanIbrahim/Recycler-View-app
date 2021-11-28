package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val Message = ArrayList<String>()
    lateinit var buttonClicked: Button
    lateinit var textEnter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClicked = findViewById(R.id.submit)
        textEnter = findViewById(R.id.textEnter)


        buttonClicked.setOnClickListener{
            if (textEnter.text != null){
                Message.add(textEnter.text.toString())
                val myRV = findViewById<RecyclerView>(R.id.rvMain)
                myRV.adapter = RecyclerViewAdapter(Message)
                myRV.layoutManager = LinearLayoutManager(this) // main activity
                textEnter.text = null

            }
        }

    }
}