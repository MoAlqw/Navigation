package com.example.navigation.view.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigation.R
import com.example.navigation.databinding.FragmentProfileSettingsBinding

class ProfileSettingsFragment: Fragment() {

    private var _binding: FragmentProfileSettingsBinding? = null
    private val binding get() = _binding!!
    private val args: ProfileSettingsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val token = args.token
        binding.tvToken.text = getString(R.string.text_view_token, token)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}