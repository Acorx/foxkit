package com.example.foxkit

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.ion_1).text = "🦊 FoxKit v1.0.4"
        findViewById<TextView>(R.id.ion_2).text = "Developer Toolkit for Android"
        findViewById<Button>(R.id.ion_3).setOnClickListener {
            startActivity(Intent(this, MyIPActivity::class.java))
        }
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            startActivity(Intent(this, NotesActivity::class.java))
        }
        findViewById<Button>(R.id.ion_5).setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}
