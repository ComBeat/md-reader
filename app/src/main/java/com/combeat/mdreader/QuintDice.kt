package com.combeat.mdreader

/**
 * Class which rolls one of the quints with the random function
 */
class QuintDice {
	private val sides: Int = 6
	private val rollNumber: Int = (1..sides).random()

	/**
	 * Returns the ID of the result string
	 */
	fun rollForQuintText(): Int {
		var resultTextId = 0

		when (rollNumber) {
			1 -> resultTextId = R.string.result_roll_ichika
			2 -> resultTextId = R.string.result_roll_nino
			3 -> resultTextId = R.string.result_roll_miku
			4 -> resultTextId = R.string.result_roll_yotsuba
			5 -> resultTextId = R.string.result_roll_itsuki
			6 -> resultTextId = R.string.result_roll_nakanos
		}

		return resultTextId
	}

	/**
	 * Returns the ID of the result image
	 */
	fun rollForQuintImage(): Int {
		var resultDrawableId = 0

		when (rollNumber) {
			1 -> resultDrawableId = R.drawable.image_ichika
			2 -> resultDrawableId = R.drawable.image_nino
			3 -> resultDrawableId = R.drawable.image_miku
			4 -> resultDrawableId = R.drawable.image_yotsuba
			5 -> resultDrawableId = R.drawable.image_itsuki
			6 -> resultDrawableId = R.drawable.image_quints_1
		}

		return resultDrawableId
	}
}