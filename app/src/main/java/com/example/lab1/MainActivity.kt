package com.example.lab1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        val name = findViewById<TextView>(R.id.fullName)
        val student = Student("Ivan Ivanov", 3)
        val anotherStudent = Student("Dmitriy", 4)
        view.text = student.fullName
        name.text = anotherStudent.toString()

    }
}

data class Student(
    val fullName: String,
    val course: Int
) {
    override fun toString(): String {
        return fullName
    }
}