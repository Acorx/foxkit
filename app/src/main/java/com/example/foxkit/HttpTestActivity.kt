package com.example.foxkit

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class HttpTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_http_test)

        findViewById<TextView>(R.id.ion_1).text = "🌐 HTTP Tester"
        findViewById<Button>(R.id.ion_3).setOnClickListener {
            do_get()
        }
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            open_url()
        }
        findViewById<TextView>(R.id.ion_5).text = "Response will appear here"
        findViewById<Button>(R.id.ion_6).setOnClickListener {
            finish()
        }

        private fun do_get() {
            Toast.makeText(this, "Requesting...", Toast.LENGTH_SHORT).show()
            Thread {
                val response = java.net.URL("https://httpbin.org/get").readText()
                Toast.makeText(this, "Done!", Toast.LENGTH_SHORT).show()
            }.start()
        }

        private fun open_url() {
            startActivity(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://httpbin.org")))
        }
    }
}
