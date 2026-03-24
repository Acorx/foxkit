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
    }
}
