package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var is_clicked: Boolean = false
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        przycisk1.setOnClickListener{
            is_clicked=!is_clicked
            if(is_clicked) {
                tekst1.text = "Hello World"
                przycisk1.text = "PREVIOUS"
            }
            else{
                tekst1.text = ""
                przycisk1.text = "Click to see"

            }
        }
    }
}
