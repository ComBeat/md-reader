package com.combeat.mdreader

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to click a button and view the result on the screen
 */
class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val rollButton: Button = findViewById(R.id.buttonRoll)

		/**
		 * Listener for the roll button which updates the TextView and ImageView depending on the
		 * result of the QuintDice class
		 */
		rollButton.setOnClickListener {
			val quintDice = QuintDice()
			val resultImageView: ImageView = findViewById(R.id.imageViewRollResult)
			val resultTextView: TextView = findViewById(R.id.textViewRollResult)

			resultImageView.setImageResource(quintDice.rollForQuintImage())
			resultTextView.setText(quintDice.rollForQuintText())
		}
	}
}