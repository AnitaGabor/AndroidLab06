package com.example.quizapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentProfileBinding
import com.example.quizapp.model.numberOfCorrectAnswer
import com.example.quizapp.viewModel.MainViewModel

class ProfileFragment: Fragment() {
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentProfileBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        val pointStr = "${viewModel.pointInProfile()} points";
        binding.scoreView.setText(pointStr)
        binding.playerName.setText(viewModel.getName())
        return binding.root

    }


}