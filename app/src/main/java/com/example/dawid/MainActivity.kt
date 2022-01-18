package com.example.dawid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setScaleX(1.5f)
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setScaleX(1.0f)
        }
        var x = 0;
        findViewById<Button>(R.id.button).setOnClickListener {
            x--
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies1)
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies2)
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies3)
            } else if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies4)
            } else if (x == 0) {
                x = 1
            }
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            x++
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies1)
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies2)
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies3)
            } else if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies4)
            } else if (x == 5)
                x = 4
        }
        findViewById<Button>(R.id.alpha).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setAlpha(125)
        }
        findViewById<Button>(R.id.alpha2).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setAlpha(250)
        }

    }
}