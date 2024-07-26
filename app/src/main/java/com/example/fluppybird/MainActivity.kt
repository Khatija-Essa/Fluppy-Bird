package com.example.fluppybird

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var startButton: Button
    private lateinit var scoreTextView: TextView
    private lateinit var timeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        val score = intent.getIntExtra("score",0)
        val  time = intent.getIntExtra("time",0)

        scoreTextView = findViewById(R.id.score_text_view)
        timeTextView = findViewById(R.id.time_text_view)
        startButton = findViewById(R.id.start_button)

        scoreTextView.text = "Score: $score"
        timeTextView.text = "Time: $time s"

        startButton.setOnClickListener{
            val i = Intent (this, GameActivity::class.java)
            startActivity(i)
            finish()
        }


    }
}