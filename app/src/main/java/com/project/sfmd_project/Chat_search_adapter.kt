package com.project.sfmd_project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Chat_search_adapter(private val doclist : ArrayList<doctors>,private val listener:OnItemClickListener):
    RecyclerView.Adapter<Chat_search_adapter.MyViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.chat_search,parent,false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return doclist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = doclist[position]
        holder.Name.setText(currentItem.name)
        holder.Type.setText(currentItem.type)

    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {

        val Name: TextView = itemView.findViewById(R.id.name)
        val Type: TextView = itemView.findViewById(R.id.type)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }

    }

}