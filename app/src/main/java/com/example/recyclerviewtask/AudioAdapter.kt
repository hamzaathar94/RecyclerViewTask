package com.example.recyclerviewtask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AudioAdapter(
    private val audioFiles: List<audioFileModel>) :
    RecyclerView.Adapter<AudioAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.textView)
        //  val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val audioFile = audioFiles[position]
        holder.nameTextView.text = audioFile.name
        // holder.imageView.setImageResource.audioFile.image)

//
//        holder.itemView.setOnClickListener {
//            oClick.onClick(position,audioFile.name,audioFile)
//
//
//        }
    }

    override fun getItemCount(): Int {
        return audioFiles.size
    }
}