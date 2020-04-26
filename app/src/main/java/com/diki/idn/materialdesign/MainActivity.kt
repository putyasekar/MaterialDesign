package com.diki.idn.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var Name: TextView
    private lateinit var Email: TextView

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fm_main, fragment, fragment::class.java.simpleName)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Name = tv_name
        Email = tv_email

        if (intent.extras != null) {
            val bundle = intent.extras
            Name.text = bundle?.getString("name")
            Email.text = bundle?.getString("email")
        } else {
            Name.text = intent.getStringExtra("name")
            Email.text = intent.getStringExtra("email")
        }
        supportActionBar?.hide()

        play.setOnClickListener {

            val playFragment = PlayFragment()
            val move = supportFragmentManager.beginTransaction()
            move.replace(R.id.fm_main, playFragment).addToBackStack(null)
                .commit()

            val fragmentPlay = PlayFragment.newInstance()
            addFragment(fragmentPlay)
        }

        edit.setOnClickListener {
            val editFragment = EditFragment()
            val move = supportFragmentManager.beginTransaction()
            move.replace(R.id.fm_main, editFragment).addToBackStack(null)
                .commit()
        }
    }
}
