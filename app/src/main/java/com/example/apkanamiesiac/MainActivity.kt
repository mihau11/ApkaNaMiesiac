package com.example.apkanamiesiac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setSupportActionBar(findViewById(R.id.my_toolbar))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btnStartAnotherActivity).setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            // start your next activity
            startActivity(intent)
        }


    }
}