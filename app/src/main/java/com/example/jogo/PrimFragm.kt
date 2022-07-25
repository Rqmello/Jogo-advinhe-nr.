package com.example.jogo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jogo.databinding.FragmentPrimBinding
import kotlin.random.Random

class PrimFragm : Fragment() {

    private var _binding: FragmentPrimBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentPrimBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //lógica a ser criada aqui...

        val randomNumber = Random.nextInt(0, 10)

        binding.mbtButton1.setOnClickListener {
            val inputtedNumber = binding.etNumdigitado.text.toString().toInt()
            compareNumbers(randomNumber, inputtedNumber)
        }
    }

    private fun compareNumbers(randomNumber: Int, inputtedNumber: Int) {
        when {
            randomNumber == inputtedNumber -> {
                navigateToDestination(fragId = R.id.quarFragm)
            }
            randomNumber > inputtedNumber -> {
                navigateToDestination(fragId = R.id.tercFragm)
            }
            else -> {
                navigateToDestination(fragId = R.id.segFragm)
            }
        }
    }

    private fun navigateToDestination(fragId: Int) {
        findNavController().navigate(resId = fragId)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}