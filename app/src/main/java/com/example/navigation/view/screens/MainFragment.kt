package com.example.navigation.view.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.setupWithNavController
import com.example.navigation.R
import com.example.navigation.databinding.FragmentMainBinding
import com.example.navigation.viewmodel.MainFragmentViewModel
import kotlin.getValue

class MainFragment: Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainFragmentViewModel by activityViewModels()
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
        val token = args.token
        viewModel.setToken(token)

        val bottomNavigationView = binding.bottomNavigation
        val navController = (childFragmentManager.findFragmentById(R.id.container_main_fragments)) as NavHostFragment
        bottomNavigationView.setupWithNavController(navController.navController)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}