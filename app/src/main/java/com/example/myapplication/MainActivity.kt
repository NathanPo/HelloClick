package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    var counter : Int = 0
    var step : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterTextViex : TextView = findViewById(R.id.textView3)
        val clickmeButton : Button = findViewById(R.id.button2)
        val resetButton : Button = findViewById(R.id.button)
        val reverseButton : Button = findViewById(R.id.button3)

        val normalButton : Button = findViewById(R.id.button4)
        val bigButton : Button = findViewById(R.id.button5)

        counterTextViex.text = counter.toString()

        clickmeButton.setOnClickListener {
            counter = counter.plus(step)
            counterTextViex.text = counter.toString()
        }

        resetButton.setOnClickListener {
            counter = 0
            step = 1
            counterTextViex.text = counter.toString()
        }

        reverseButton.setOnClickListener {
            step = step.times(-1)
        }

        normalButton.setOnClickListener {
            step = step.sign * 1
        }

        bigButton.setOnClickListener {
            step = step.sign.times(2)
        }

    }
}