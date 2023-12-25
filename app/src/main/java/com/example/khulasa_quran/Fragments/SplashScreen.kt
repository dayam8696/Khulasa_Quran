package com.example.khulasa_quran.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.khulasa_quran.databinding.SplashScreenBinding

class SplashScreen : BaseFragment() {
    private val binding by lazy { SplashScreenBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}