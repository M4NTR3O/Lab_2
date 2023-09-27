package com.example.lab2withoutgit

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //объявление экземпляров
        val button_solve = findViewById<Button>(R.id.solution)
        val input_condition = findViewById<EditText>(R.id.input_text)
        button_solve.setOnClickListener {
            val condition = input_condition.text.toString().toDouble()
            var result: Double = 0.0
            var n: Int = 1
            var factorial: Int = 1
            do {

            }while(condition < 1/factorial)
        }
    }
}
