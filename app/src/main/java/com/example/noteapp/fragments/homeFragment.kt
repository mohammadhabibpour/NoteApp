package com.example.noteapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.*
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import com.example.noteapp.R
import androidx.navigation.findNavController
import com.example.noteapp.databinding.FragmentHomeBinding


class homeFragment : Fragment(R.layout.fragment_home) {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setHasOptionsMenu(true)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fabUpdate.setOnClickListener { mView ->
            mView.findNavController().navigate(R.id.action_homeFragment_to_newNoteFragment)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.home_menu,menu)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container,false)
        return binding.root
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}