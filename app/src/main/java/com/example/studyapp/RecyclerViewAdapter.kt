package com.example.studyapp

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card.view.*

class RecyclerViewAdapter(private val applicationContext: Context, private val cards: List<CardInfo>): RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.card,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val title = cards[position].title
        val description = cards[position].description

        holder.itemView.apply {
            cardTitle.text = title
            cardDescription.text = description
        }
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    override fun onBindViewHolder(
        holder: ItemViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)


        // this is alert
        //=======================================================================



        holder.itemView.apply {
            linear.setOnClickListener{
                val builder = AlertDialog.Builder(applicationContext)

                //set title for alert dialog
                builder.setTitle(cards[position].title)

                //set message for alert dialog
                builder.setMessage(cards[position].description)
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                //performing positive action
                builder.setNeutralButton("OK"){dialogInterface, which ->
                    Toast.makeText(applicationContext,"OK!",Toast.LENGTH_LONG).show()
                }

                // Create the AlertDialog
                val alertDialog: AlertDialog = builder.create()
                // Set other dialog properties
                alertDialog.setCancelable(true)
                alertDialog.show()
            }
        }



        //=======================================================================
    }
}