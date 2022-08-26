package com.technipixl.listmaker.ui.main

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListRecyclerViewAdapter:RecyclerView.Adapter<ListSelectionViewHolder>() {

    val listTitles = arrayOf("Shopping List","Chores","Android Tutorials")

    override fun getItemCount(): Int {
        return listTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}


