package com.example.myapplication3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnexplicit1=findViewById<Button>(R.id.button2)

        btnexplicit1.setOnClickListener{
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
        val btnimplict= findViewById<Button>(R.id.button3)
        btnimplict.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com/bauyrzhanuly_shyngys/")
            startActivity(intent)
        }
        val btnexplicit2 = findViewById<Button>(R.id.button4)
        btnexplicit2.setOnClickListener {
            val intent1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent1)
        }

    }
}