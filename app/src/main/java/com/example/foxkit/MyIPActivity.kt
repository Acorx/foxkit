package com.example.foxkit

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MyIPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_i_p)

        findViewById<TextView>(R.id.ion_1).text = "📡 My Public IP"
        findViewById<TextView>(R.id.ion_2).text = "Tap Load to fetch your IP"
        findViewById<TextView>(R.id.ion_3).text = ""
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            load_ip()
        }
        findViewById<Button>(R.id.ion_5).setOnClickListener {
            finish()
        }
    }

    private fun load_ip() {
        Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()
        Thread {
            val ip = java.net.URL("https://api.ipify.org").readText()
            runOnUiThread { Toast.makeText(this, ("IP: " + ip), Toast.LENGTH_SHORT).show() }
        }.start()
    }
}
