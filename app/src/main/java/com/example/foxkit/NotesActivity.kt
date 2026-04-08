package com.example.foxkit

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class NotesActivity : AppCompatActivity() {
    private lateinit var noteInput: EditText
    private val PREFS_NAME = "FoxKitNotes"
    private val NOTE_KEY = "saved_note"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        findViewById<TextView>(R.id.ion_1).text = "📝 Quick Notes"
        
        noteInput = findViewById(R.id.ion_2)
        noteInput.hint = "Write a note..."
        
        // Charger la note sauvegardée
        loadSavedNote()
        
        findViewById<Button>(R.id.ion_3).setOnClickListener {
            saveNote()
        }
        
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            shareNote()
        }
        
        findViewById<Button>(R.id.ion_5).setOnClickListener {
            noteInput.setText("")
            getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .edit()
                .remove(NOTE_KEY)
                .apply()
            Toast.makeText(this, "Note cleared!", Toast.LENGTH_SHORT).show()
        }
        
        findViewById<Button>(R.id.ion_6).setOnClickListener {
            finish()
        }
    }

    private fun loadSavedNote() {
        val prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val savedNote = prefs.getString(NOTE_KEY, "")
        if (!savedNote.isNullOrEmpty()) {
            noteInput.setText(savedNote)
        }
    }

    private fun saveNote() {
        val noteText = noteInput.text.toString()
        if (noteText.isNotBlank()) {
            getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .edit()
                .putString(NOTE_KEY, noteText)
                .apply()
            Toast.makeText(this, "Note saved!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please write something first", Toast.LENGTH_SHORT).show()
        }
    }

    private fun shareNote() {
        val textToShare = noteInput.text.toString()
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