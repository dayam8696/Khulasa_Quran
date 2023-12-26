package com.example.khulasa_quran.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.khulasa_quran.R
import com.example.khulasa_quran.databinding.FragmentFirstBinding

class FirstFragment:BaseFragment(){
    private val binding by lazy { FragmentFirstBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnstart.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        binding.btnauthor.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_fragmentAuthor)
        }
        binding.btnpara.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_paraIndex)
        }
    }
}