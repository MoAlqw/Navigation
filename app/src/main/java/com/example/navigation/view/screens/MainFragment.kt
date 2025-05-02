package com.example.navigation.view.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import com.example.navigation.R
import com.example.navigation.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val args: MainFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomNavigation = binding.bottomNavigation
        val navController = childFragmentManager.findFragmentById(binding.containerMainFragments.id)!!.findNavController()
        NavigationUI.setupWithNavController(bottomNavigation, navController)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}