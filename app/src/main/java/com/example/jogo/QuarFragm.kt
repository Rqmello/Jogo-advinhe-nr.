package com.example.jogo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jogo.databinding.FragmentQuarBinding

class QuarFragm: Fragment() {

    private var _binding: FragmentQuarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentQuarBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mbtButton4.setOnClickListener {
            findNavController().navigate(resId = R.id.primFragm)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}