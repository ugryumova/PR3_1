package com.example.pr31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeActivity(view: View){
        val min: EditText = findViewById(R.id.minNumber)
        val max: EditText = findViewById(R.id.maxNumber)
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("Min", min.text.toString());
        intent.putExtra("Max", max.text.toString());
        startActivity(intent)
    }
}