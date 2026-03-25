package com.example.foxkit

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MyIPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_i_p)

        findViewById<TextView>(R.id.ion_1).text = "📡 Network Info"
        findViewById<TextView>(R.id.ion_2).text = "Tap Refresh to load your IP"
        findViewById<Button>(R.id.ion_3).setOnClickListener {
            refresh_ip()
        }
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            finish()
        }
    }

    private fun refresh_ip() {
        Toast.makeText(this, "Refreshing...", Toast.LENGTH_SHORT).show()
    }
}
