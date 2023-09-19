package com.example.challange3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.challange3.databinding.FragmentFramentKeduaBinding


class FramentKedua : Fragment() {

    private var _binding: FragmentFramentKeduaBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFramentKeduaBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aName = arguments?.getString(HomeFragment.EXTRA_NAME)

        binding.tvName.text = "Nama Kamu: $aName"

        binding.btnFragmentKetiga.setOnClickListener{
            if (binding.etName.text.isNullOrEmpty()){
                Toast.makeText(requireContext(), "Kolom Nama masih kosong",
                    Toast.LENGTH_SHORT).show()
            } else {
                val actionToFragmentKetiga =
                    FramentKeduaDirections.actionFramentKeduaToFragmentKetiga()
                actionToFragmentKetiga.name = binding.etName.text.toString()
                view.findNavController().navigate(actionToFragmentKetiga)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    }
