package com.thida.biography

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thida.biography.model.FamilyInfo

class FamilyRecyclerAdapter constructor(private val familyList:List<FamilyInfo>?) : RecyclerView.Adapter<FamilyRecyclerAdapter.FamilyItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FamilyItemHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.recycler_item,parent,false)

        return FamilyItemHolder(view)
    }

    override fun getItemCount(): Int {
        return familyList!!.size
    }

    override fun onBindViewHolder(holder: FamilyItemHolder, position: Int) {
        val familyInfo : FamilyInfo? = familyList?.get(position)
        holder.timage.setImageResource(familyInfo!!.image)
        holder.tname.text = familyInfo.name
        holder.trelation.text = familyInfo.relation
    }


    inner class FamilyItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var timage:ImageView = itemView.findViewById(R.id.image)
         var tname:TextView = itemView.findViewById(R.id.name)
         var trelation:TextView = itemView.findViewById(R.id.relation)


    }
}