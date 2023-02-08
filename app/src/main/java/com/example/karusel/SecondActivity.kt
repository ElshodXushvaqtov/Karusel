package com.example.karusel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    private lateinit var img: ImageView
    private lateinit var btn_back: ImageView
    private lateinit var btn_next: ImageView
    private var index = 0
    private var images: MutableList<Int> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        img = findViewById(R.id.image)
        btn_back = findViewById(R.id.back_image)
        btn_next = findViewById(R.id.next_image)
        images.add(R.drawable.img1)
        images.add(R.drawable.img2)
        images.add(R.drawable.img3)
        images.add(R.drawable.img4)
        images.add(R.drawable.img5)
        images.add(R.drawable.img6)
        index = intent.getIntExtra("image", 3)
        for (i in 0 until images.size) {
            if (index == i) {
                img.setImageResource(images[i])
            }
        }
        btn_back.setOnClickListener {
            if (index == 0)
                index = images.size
            index--
            img.setImageResource(images[index])
        }

        btn_next.setOnClickListener {
            if (index < images.size - 1) {
                index++
            } else {
                index = 0
            }
            img.setImageResource(images[index])
        }
    }
}