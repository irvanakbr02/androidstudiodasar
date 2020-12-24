package com.example.pluginintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input.*

class input : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        Btndata.setOnClickListener {
            val name = etname.text.toString()
            val age = etage.text.toString().toInt()
            val address = etaddress.text.toString()
            Intent(this, output :: class.java).also {
                it.putExtra("EXTRA_NAME",name)
                it.putExtra("EXTRA_AGE",age)
                it.putExtra("EXTRA_ADDRESS",address)
                startActivity(it)
            }
        }
    }
}