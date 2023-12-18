package com.example.khulasa_quran.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.khulasa_quran.databinding.FragmentAuthorBinding

class FragmentAuthor : BaseFragment() {
    private val binding by lazy { FragmentAuthorBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}