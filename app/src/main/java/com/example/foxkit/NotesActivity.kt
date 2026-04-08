package com.example.foxkit

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class NotesActivity : AppCompatActivity() {
    private lateinit var noteInput: EditText
    private var noteText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        findViewById<TextView>(R.id.ion_1).text = "📝 Quick Notes"
        
        noteInput = findViewById(R.id.ion_2)
        noteInput.hint = "Write a note..."
        
        findViewById<Button>(R.id.ion_3).setOnClickListener {
            saveNote()
        }
        
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            shareNote()
        }
        
        findViewById<Button>(R.id.ion_5).setOnClickListener {
            noteInput.setText("")
            noteText = ""
            Toast.makeText(this, "Note cleared!", Toast.LENGTH_SHORT).show()
        }
        
        findViewById<Button>(R.id.ion_6).setOnClickListener {
            finish()
        }
    }

    private fun saveNote() {
        noteText = noteInput.text.toString()
        if (noteText.isNotBlank()) {
            Toast.makeText(this, "Note saved!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please write something first", Toast.LENGTH_SHORT).show()
        }
    }

    private fun shareNote() {
        val textToShare = if (noteText.isNotBlank()) noteText else noteInput.text.toString()
        if (textToShare.isNotBlank()) {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, textToShare)
            startActivity(Intent.createChooser(shareIntent, "Share note"))
        } else {
            Toast.makeText(this, "Nothing to share", Toast.LENGTH_SHORT).show()
        }
    }
}