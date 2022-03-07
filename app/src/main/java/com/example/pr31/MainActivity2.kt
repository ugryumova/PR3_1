package com.example.pr31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    var min = 0.0
    var max = 0.0
    var average = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text: TextView = findViewById(R.id.Ttext);
        min = intent.getStringExtra("Min")!!.toDouble()
        max = intent.getStringExtra("Max")!!.toDouble()
        if(min != max){
            average = ((min+max)/2).toInt()
            text.setText("Число больше " + average.toString() + "?")
        }
        else{
            text.setText("Ваше число " + min.toInt().toString())
        }
    }
    fun question_yes(view: View){
        val text: TextView = findViewById(R.id.Ttext)
        min = average + 1.0
        if(min != max){
            average = ((min+max)/2).toInt()
            text.setText("Число больше " + average.toString() + "?")
        }
        else{
            text.setText("Ваше число " + min.toInt().toString())
        }
    }
    fun question_no(view: View){
        val text: TextView = findViewById(R.id.Ttext)
        max = average.toDouble()
        if(min != max){
            average = ((min+max)/2).toInt()
            text.setText("Число больше " + average.toString() + "?")
        }
        else{
            text.setText("Ваше число " + min.toInt().toString())
        }
    }
}