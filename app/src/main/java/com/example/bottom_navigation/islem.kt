package com.example.bottom_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottom_navigation.databinding.FragmentIslemBinding
import com.example.bottom_navigation.databinding.FragmentUrunsecenekBinding

class islem : Fragment() {
    private lateinit var binding: FragmentIslemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentIslemBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }


}