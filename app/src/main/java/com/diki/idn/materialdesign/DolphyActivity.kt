package com.diki.idn.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_dolphy.*

class DolphyActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dolphy)

        login.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
        tv_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
