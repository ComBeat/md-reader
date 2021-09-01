package com.combeat.mdreader

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.combeat.mdreader.adapter.MangaAdapter
import com.combeat.mdreader.databinding.ActivityMainBinding

/**
 * This activity allows the user to click a button and view the result on the screen
 */
class MainActivity : AppCompatActivity() {
	private lateinit var recyclerView: RecyclerView

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		recyclerView = binding.recyclerView
		recyclerView.layoutManager = GridLayoutManager(this, 2)
		recyclerView.adapter = MangaAdapter()

		//val rollButton: Button = binding.buttonRoll

		/**
		 * Listener for the roll button which updates the TextView and ImageView depending on the
		 * result of the QuintDice class
		 */
		/*rollButton.setOnClickListener {
			val quintDice = QuintDice()
			val resultImageView: ImageView = binding.imageViewRollResult
			val resultTextView: TextView = binding.textViewRollResult

			resultImageView.setImageResource(quintDice.rollForQuintImage())
			resultTextView.setText(quintDice.rollForQuintText())
		}*/
	}
}