package com.example.jogo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jogo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var _binding: ActivityMainBinding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        var root = binding.root
        setContentView(root)



    }
}