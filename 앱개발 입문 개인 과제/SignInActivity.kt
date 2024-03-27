package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnsignup = findViewById<Button>(R.id.btn_signup)
        btnsignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        val idData = intent.getStringExtra( "dataId")
        val editText_id = findViewById<EditText>(R.id.userId)
        editText_id.setText(idData)

        val passwordData = intent.getStringExtra( "datapassword")
        val editText_password = findViewById<EditText>(R.id.editTextTextPassword)
        editText_password.setText(passwordData)

        val btnlogin = findViewById<Button>(R.id.btn_login)

        btnlogin.setOnClickListener {
            val user_id = findViewById<EditText>(R.id.userId)
            val strData = user_id.text.toString()
            val password = findViewById<TextView>(R.id.editTextTextPassword)

            if (user_id.text.isBlank()) {
                Toast.makeText(this, "아이디를 입력해 주세요", Toast.LENGTH_SHORT).show()
            } else if (password.text.isBlank()) {
                Toast.makeText(this, "비밀번호를 입력해 주세요", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("dataFromSignActivity", strData)
                startActivity(intent)
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
            }
        }


        }
    }

