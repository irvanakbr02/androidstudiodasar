package com.example.pluginintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*

class output : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val alamat = intent.getStringExtra("EXTRA_ADDRESS")
        val outputdata = "namamu adalah $name, umurmu $age, dan kamu tinggal di $alamat "

        tvoutput.text = outputdata
    }
}