package com.example.pluginintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profil.setOnClickListener {
            Intent(this, myprofile::class.java).also{
                startActivity(it)
            }
        }
        inputdata.setOnClickListener {
            Intent(this, input :: class.java).also{
                startActivity(it)
            }
        }
        github.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://github.com/Irvanakbr02"))
            startActivity(intent)
        }
        exit.setOnClickListener {
            finish()
        }
    }

}