package com.example.jogo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jogo.databinding.FragmentTercBinding

class TercFragm : Fragment() {

    private var _binding: FragmentTercBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTercBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mbtButton3.setOnClickListener {
            findNavController().navigate(resId = R.id.primFragm)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}