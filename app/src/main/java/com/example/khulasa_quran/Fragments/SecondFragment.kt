package com.example.khulasa_quran.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.khulasa_quran.databinding.FragmentSecondBinding

class SecondFragment:BaseFragment() {
    private val binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}