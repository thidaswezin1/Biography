package com.thida.biography

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(private val myContext: Context, fm: FragmentManager, private var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return FamilyFragment()
            }
            1 -> {
                return EducationFragment()
            }
            2 -> {
                return ExperienceFragment()
            }
           else -> return FamilyFragment()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}