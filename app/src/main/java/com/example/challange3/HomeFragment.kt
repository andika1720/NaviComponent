package com.example.challange3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.challange3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    companion object{
        val EXTRA_NAME = "EXTRA_NAME"

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFragmentDua.setOnClickListener{
            val mBundle = Bundle()
            mBundle.putString(EXTRA_NAME, "Andika Pertama")
            it.findNavController().navigate(R.id.action_homeFragment_to_framentKedua, mBundle)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}