package com.example.partytask.presentation.UI.party

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.partytask.R
import com.example.partytask.data.model.Party

class PartyListAdapter (private var items:MutableList<Party>):RecyclerView.Adapter<PartyListAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartyListAdapter.Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.layout_listitem,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PartyListAdapter.Holder, position: Int) {

    }
    inner class Holder(view: View):RecyclerView.ViewHolder(view){

    }

}