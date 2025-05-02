package com.example.navigation.view.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // As if we got this value from some data source, for example SharedPreferences
        val randInt = (0..1).random()

        val action = if (randInt == 1) {
            SplashFragmentDirections.actionSplashFragmentToMainFragment(1)
        } else {
            SplashFragmentDirections.actionSplashFragmentToLoginFragment()
        }
        view.postDelayed({
            findNavController().navigate(action)
        }, 1000)
    }

}