import com.mohitsharda.a7minutesworkout.R

options package com.mohitsharda.a7minutesworkout

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llStart = findViewById<LinearLayout>(R.id.ll_start)

        llStart.setOnClickListener {
            Toast.makeText(this, "Here we will start exercise", Toast.LENGTH_SHORT).show()
        }
    }
}