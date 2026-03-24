package com.example.foxkit

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class NotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        findViewById<TextView>(R.id.ion_1).text = "📝 Quick Notes"
        findViewById<Button>(R.id.ion_3).setOnClickListener {
            save_note()
        }
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            share_notes()
        }
        findViewById<Button>(R.id.ion_5).setOnClickListener {
            android.app.AlertDialog.Builder(this).setTitle("Clear?").setMessage("Delete all notes?").setPositiveButton("OK", null).show()
        }
        findViewById<Button>(R.id.ion_6).setOnClickListener {
            finish()
        }
    }
}
