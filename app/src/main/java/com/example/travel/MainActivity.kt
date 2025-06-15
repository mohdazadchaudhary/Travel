package com.example.travel

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var currentImage = 0
    private val images = arrayOf(
        R.drawable.pic0,
        R.drawable.pic1,
        R.drawable.pic2,
        R.drawable.pic3,
        R.drawable.pic4,
        R.drawable.pic5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val next = findViewById<ImageButton>(R.id.next)
        val back = findViewById<ImageButton>(R.id.back)

        next.setOnClickListener {
            if (currentImage < images.size - 1) {
                currentImage++
                imageView.setImageResource(images[currentImage])
            }
        }

        back.setOnClickListener {
            if (currentImage > 0) {
                currentImage--
                imageView.setImageResource(images[currentImage])
            }
        }
    }
}
