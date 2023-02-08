package com.example.karusel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var images: MutableList<ImageView> = mutableListOf()
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var img1 = findViewById<ImageView>(R.id.img1)
        var img2 = findViewById<ImageView>(R.id.img2)
        var img3 = findViewById<ImageView>(R.id.img3)
        var img4 = findViewById<ImageView>(R.id.img4)
        var img5 = findViewById<ImageView>(R.id.img5)
        var img6 = findViewById<ImageView>(R.id.img6)
        images.add(img1)
        images.add(img2)
        images.add(img3)
        images.add(img4)
        images.add(img5)
        images.add(img6)

        for (i in 0 until images.size) {
            images[i].setOnClickListener {
                index = i
                intent(index)
            }
        }
    }

    private fun intent(image_tag: Int) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("image", image_tag)
        startActivity(intent)
    }
}