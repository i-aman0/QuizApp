package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart=findViewById<Button>(R.id.btnStart)
        val etName=findViewById<EditText>(R.id.etName)

        btnStart.setOnClickListener(){
            if(etName.text.isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
            else{
                // go from current activity(this) to QuizQuestionsActivity
                val intent=Intent(this, QuizQuestionsActivity::class.java)

                // sending the data from current activiy to the QuizQuestionsActivity using intent
                intent.putExtra(Constants.USER_NAME, etName.text.toString())



                // starts the activity defined in the intent
                startActivity(intent)

                // closes the current activity(this)
                // does not allow to go back from QuizQuestionsActivity to MainActivity
                finish()
            }
        }
    }
}