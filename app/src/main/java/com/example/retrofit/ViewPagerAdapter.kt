package com.example.retrofit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.retrofit.screens.second.SecondFragment
import com.example.retrofit.screens.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity)  {
    override fun getItemCount(): Int {
    return 2
    }

    override fun createFragment(position: Int): Fragment {
      return when (position){
          0-> StartFragment()
          else -> SecondFragment()
      }
    }
// создать фрагменты которые у нас будут
}