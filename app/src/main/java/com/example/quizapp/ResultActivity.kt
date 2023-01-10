package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView=findViewById(R.id.tvName)
        val tvScore: TextView=findViewById(R.id.tvScore)
        val btnFinish: Button=findViewById(R.id.btnFinish)

        tvName.text=intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions:Int=intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers: Int=intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text="Your score is $correctAnswers out of $totalQuestions"

        // once the user clicks on the finish button, he will be sent to the main page (MainActivity) again
        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}