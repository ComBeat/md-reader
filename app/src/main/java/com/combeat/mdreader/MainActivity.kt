package com.combeat.mdreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener {
            val resultImageView: ImageView = findViewById(R.id.imageViewRollResult)
            val resultTextView: TextView = findViewById(R.id.textViewRollResult)
            val quintDice = QuintDice()

            resultImageView.setImageResource(quintDice.rollForQuintImage())
            resultTextView.setText(quintDice.rollForQuintText())
        }
    }
}