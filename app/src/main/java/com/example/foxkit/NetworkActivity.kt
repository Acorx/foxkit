package com.example.foxkit

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class NetworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)

        findViewById<TextView>(R.id.ion_1).text = "🌐 Network Tools"
        findViewById<TextView>(R.id.ion_2).text = "Useful links for developers"
        findViewById<Button>(R.id.ion_3).setOnClickListener {
            startActivity(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://dns.google/")))
        }
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            startActivity(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://whatismyipaddress.com/")))
        }
        findViewById<Button>(R.id.ion_5).setOnClickListener {
            startActivity(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://speedtest.net")))
        }
        findViewById<Button>(R.id.ion_6).setOnClickListener {
            finish()
        }
    }
}
