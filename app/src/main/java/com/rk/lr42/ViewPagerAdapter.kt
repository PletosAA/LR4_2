package com.rk.lr42

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rk.lr4.FragmentFour
import com.rk.lr4.FragmentOne
import com.rk.lr4.FragmentThree
import com.rk.lr4.FragmentTwo

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 4
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentOne()
            1 -> FragmentTwo()
            2 -> FragmentThree()
            3 -> FragmentFour()
            else -> FragmentOne()
        }
    }
}
