package com.diki.idn.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var Name: String
    private lateinit var Email: String

    private var fieldEmpty: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_submit.setOnClickListener {
            Name = name.text.toString().trim()
            Email = email.text.toString().trim()

            if (Name.isEmpty()) {
                fieldEmpty = true
                name.error = resources.getString(R.string.error_empty_field)
            }
            if (Email.isEmpty()) {
                fieldEmpty = true
                email.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {

                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("name", name.text.toString())
                intent.putExtra("email", email.text.toString())
                startActivity(intent)

            }
        }
    }
}
