package com.example.challange3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.challange3.databinding.FragmentKetigaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentKetiga.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentKetiga : Fragment() {
    private var _binding: FragmentKetigaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKetigaBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aName = FragmentKetigaArgs.fromBundle(arguments as Bundle).name

        binding.tvName3.text = "Namanya : $aName"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}