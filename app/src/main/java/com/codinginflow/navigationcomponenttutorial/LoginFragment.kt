package com.codinginflow.navigationcomponenttutorial

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//  IMPORTANT, you have to Build-> Rebuild project after typing in the following line
        //  (before typing in val action
        //  See the tutorial video Part 3 https://youtu.be/5OpE7ftsYG8 at 5m 40s
        // something to do with the use of safeargs plugin which needs to
        // generate some code that only happens at compile time.
        // If Build->Rebuild is successful the HomeFragmentDirections class below
        // should be automatically generated with the name taken from the
        // HomeFragment class. It should show up automatically as you type it in.
        button_confirm.setOnClickListener {
            val username = edit_text_username.text.toString()
            val password = edit_text_password.text.toString()

            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)
        }
    }
}