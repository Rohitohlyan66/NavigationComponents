package com.example.navigationcomponents.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponents.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        
        btn_login.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragment2ToLoginFragment()
            findNavController().navigate(action)
        }
    }
}