package com.combeat.mdreader.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.combeat.mdreader.R

class MangaAdapter(private val context:Context) : RecyclerView.Adapter<MangaAdapter.MangaItemViewHolder>() {
	// List of mangas, that appear in the library
	private val mangas = listOf(R.array.mangas)

	class MangaItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
		val button = view.findViewById<Button>(R.id.button_library)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaItemViewHolder {
		TODO("Not yet implemented")
	}

	override fun onBindViewHolder(holder: MangaItemViewHolder, position: Int) {
		TODO("Not yet implemented")
	}

	override fun getItemCount(): Int {
		TODO("Not yet implemented")
	}
}