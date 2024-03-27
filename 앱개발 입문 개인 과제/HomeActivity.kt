package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val strData = intent.getStringExtra( "dataFromSignActivity")
        val editText = findViewById<EditText>(R.id.userId_h)
        editText.setText(strData)

        val btn = findViewById<Button>(R.id.btn_back)
        btn.setOnClickListener {
            finish()
        }
    }
}