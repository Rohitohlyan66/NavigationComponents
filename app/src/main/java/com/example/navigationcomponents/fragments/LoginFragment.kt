package com.example.navigationcomponents.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponents.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        confirm.setOnClickListener {

            val name = name.text.toString()
            val password = password.text.toString()

            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(name, password)
            findNavController().navigate(action)
        }
    }
}