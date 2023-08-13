package com.example.bottom_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.example.bottom_navigation.databinding.FragmentUrunsecenekBinding


class urunsecenek : Fragment() {
    private lateinit var binding: FragmentUrunsecenekBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentUrunsecenekBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }


}
