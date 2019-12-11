package com.thida.biography

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thida.biography.model.FamilyInfo


class FamilyFragment : Fragment() {
    private lateinit var recyclerView:RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.family,container,false)
        recyclerView = view.findViewById(R.id.recycler_view)

        val father = FamilyInfo(R.mipmap.father,"U Kyaw Win" , "Father ")
        val mother = FamilyInfo(R.mipmap.mother,"Daw Nu Nu Htwe","Mother")
        val bro1 = FamilyInfo(R.mipmap.bro,"U Thura","Brother")
        val bro2 = FamilyInfo(R.mipmap.bro,"U Nanda","Brother")
        val bro3 = FamilyInfo(R.mipmap.bro,"U Nyi Soe","Brother")
        val niece = FamilyInfo(R.mipmap.baby,"Kyal Sin ","Niece")

        val familyList : MutableList<FamilyInfo> = ArrayList()
        familyList.add(father)
        familyList.add(mother)
        familyList.add(bro1)
        familyList.add(bro2)
        familyList.add(bro3)
        familyList.add(niece)

        val layoutManager = LinearLayoutManager(view.context)
        recyclerView.layoutManager = layoutManager

        val adapter = FamilyRecyclerAdapter(familyList)
        recyclerView.adapter = adapter

        return view
    }
}