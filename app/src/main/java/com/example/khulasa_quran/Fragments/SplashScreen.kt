package com.example.khulasa_quran.Fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.khulasa_quran.R
import com.example.khulasa_quran.databinding.SplashScreenBinding

class SplashScreen : BaseFragment() {
    private val binding by lazy { SplashScreenBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =binding.root

        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_firstFragment)

        },2500)

        return view
    }
}