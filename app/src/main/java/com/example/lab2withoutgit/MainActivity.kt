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
        val output_result = findViewById<EditText>(R.id.result)
        val output_term = findViewById<EditText>(R.id.lastTerm)
        val output_itterations = findViewById<EditText>(R.id.Itterations)
        button_solve.setOnClickListener {
            val condition = input_condition.text.toString().toDouble()
            var result: Double = 0.0
            var n: Int = 1
            var factorial: Int = 1
            //цикл прибавления
            do {
                result += 1 / factorial
                n += 2
                factorial *= n * (n - 1)
            }while(condition < 1/factorial)
            factorial /= (n * (n - 1))
            //вывод результата
            output_result.setText(result.toString())
            output_term.setText((1/factorial).toString())
            output_itterations.setText((n/2).toString())
        }
    }
}
