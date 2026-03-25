package com.example.foxkit

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        findViewById<TextView>(R.id.ion_1).text = "🦊 FoxKit v1.0"
        findViewById<TextView>(R.id.ion_2).text = "Built with ion ⚡"
        findViewById<TextView>(R.id.ion_3).text = "1349 lines of Go"
        findViewById<Button>(R.id.ion_4).setOnClickListener {
            startActivity(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://github.com/Acorx/ion")))
        }
        findViewById<Button>(R.id.ion_5).setOnClickListener {
            finish()
        }
    }
}
