package com.example.navigationcomponents.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponents.R
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment(R.layout.fragment_login) {

    private val args: LoginFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameDeepLink = args.name

        name.setText(nameDeepLink)

        confirm.setOnClickListener {

            val name = name.text.toString()
            val password = password.text.toString()

            val action =
                LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(name, password)
            findNavController().navigate(action)


        }
    }
}