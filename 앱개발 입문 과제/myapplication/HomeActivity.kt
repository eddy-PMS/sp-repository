package com.example.myapplication

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {

    private val imageArray = arrayOf(
        R.drawable.profile,
        R.drawable.profile2,
        R.drawable.profile3,
        R.drawable.profile4,
        R.drawable.profile5,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val strData = intent.getStringExtra( "dataFromSignActivity")
        val editText = findViewById<EditText>(R.id.userId_h)
        editText.setText(strData)

        val imageView = findViewById<ImageView>(R.id.profileView)
        setRandomImage(imageView)


        val btn = findViewById<Button>(R.id.btn_back)
        btn.setOnClickListener {
            finish()
        }
    }
    private fun setRandomImage(imageView: ImageView) {
        val randomIndex = (imageArray.indices).random()
        val randomImageResourceId = imageArray[randomIndex]
        imageView.setImageResource(randomImageResourceId)
    }
}
