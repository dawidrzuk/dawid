package com.example.dawid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies1)
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setScaleX(1.5f)
        }
    }
}