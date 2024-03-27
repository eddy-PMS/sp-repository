package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnsignup = findViewById<Button>(R.id.button_signup)

        btnsignup.setOnClickListener {
            val user_name = findViewById<EditText>(R.id.editTextname)
//            val strData = user_name.text.toString()
            val user_id = findViewById<EditText>(R.id.editTextID)
            val idData = user_id.text.toString()
            val password = findViewById<TextView>(R.id.editTextTextPassword_up)
            val passwordData = password.text.toString()

            if (user_name.text.isBlank()) {
                Toast.makeText(this, "이름을 입력해 주세요", Toast.LENGTH_SHORT).show()
            } else if (user_id.text.isBlank()) {
                Toast.makeText(this, "아이디를 입력해 주세요", Toast.LENGTH_SHORT).show()
            } else if (password.text.isBlank()) {
                Toast.makeText(this, "비밀번호를 입력해 주세요", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SignInActivity::class.java)
                intent.putExtra("dataId", idData)
                intent.putExtra("datapassword", passwordData)
                startActivity(intent)
                Toast.makeText(this, "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show()

            }
        }
    }

}