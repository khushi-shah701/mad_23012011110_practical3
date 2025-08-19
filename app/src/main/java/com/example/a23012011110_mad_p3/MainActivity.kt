package com.example.a23012011110_mad_p3

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // --- Web Browser ---
        val browseButton = findViewById<Button>(R.id.button_browse)
        val inputUrl = findViewById<EditText>(R.id.editTextText2)
        browseButton.setOnClickListener {
            val url = inputUrl.text.toString().trim()
            if (url.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://$url"))
                startActivity(intent)
            } else {
                Toast.makeText(this, "Enter a URL", Toast.LENGTH_SHORT).show()
            }
        }

        // --- Phone Call ---
        val phoneInput = findViewById<EditText>(R.id.editTextPhone)
        val callButton = findViewById<Button>(R.id.button1)
        callButton.setOnClickListener {
            val number = phoneInput.text.toString().trim()
            if (number.isNotEmpty()) {
                Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:$number")
                    startActivity(this)
                }

            } else {
                Toast.makeText(this, "Enter phone number", Toast.LENGTH_SHORT).show()
            }
        }

        // --- Call Log ---
        val callLogBtn = findViewById<Button>(R.id.button2)
        callLogBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://call_log/calls"))
            startActivity(intent)
        }

        // --- Gallery ---
        findViewById<Button>(R.id.button3).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivity(intent)
        }

        // --- Camera ---
        findViewById<Button>(R.id.button4).setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        // --- Alarms ---
        findViewById<Button>(R.id.button5).setOnClickListener {
            val intent = Intent(AlarmClock.ACTION_SHOW_ALARMS)
            startActivity(intent)
        }

        // --- Login ---
        findViewById<Button>(R.id.button6).setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java).apply {
                putExtra("username", "username")
                putExtra("password", "password")
            }
            startActivity(intent)
        }
    }
}