package com.combeat.mdreader.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.combeat.mdreader.R

class MangaAdapter(context: Context) : RecyclerView.Adapter<MangaAdapter.MangaItemViewHolder>() {
	// List of mangas, that appear in the library
	private val mangas: List<String> = context.resources.getStringArray(R.array.mangas).toList()

	/**
	 * Provides a reference for the views needed to display items in your list.
	 */
	class MangaItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
		val button = view.findViewById<Button>(R.id.button_library)
	}

	/**
	 * Creates new views with [R.layout.library_item_view] as its template
	 */
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaItemViewHolder {
		val layout = LayoutInflater
				.from(parent.context)
				.inflate(R.layout.library_item_view, parent, false)
		return MangaItemViewHolder(layout)
	}

	/**
	 * Replaces the content of an existing view with new data
	 */
	override fun onBindViewHolder(holder: MangaItemViewHolder, position: Int) {
		val item = mangas[position]

		holder.button.text = item
		holder.button.setOnClickListener{
			val context = holder.view.context
			Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
		}
	}

	override fun getItemCount() = mangas.size
}