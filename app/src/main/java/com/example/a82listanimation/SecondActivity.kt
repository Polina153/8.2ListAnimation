package com.example.a82listanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.a82listanimation.FlowerObject.flowerList

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val title = findViewById<TextView>(R.id.title)
        val image = findViewById<ImageView>(R.id.imageView)

        val flowerId = intent.getIntExtra("ID", 0)
        title.text = flowerList[flowerId].text

        image.setImageDrawable(
            ContextCompat.getDrawable(this, flowerList[flowerId].img)
        )
    }
}