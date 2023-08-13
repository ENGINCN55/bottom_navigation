package com.example.bottom_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.bottom_navigation.databinding.FragmentAnasayfaBinding


class anasayfa : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var navCohtroller: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navCohtroller= Navigation.findNavController(view)

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentAnasayfaBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }


}