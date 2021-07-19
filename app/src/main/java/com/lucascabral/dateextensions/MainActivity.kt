package com.lucascabral.dateextensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.lucascabral.dateextensions.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.currentTimeStampButton.setOnClickListener {
            binding.currentTimeStampButton.setLoading()
            lifecycleScope.launch {
                delay(3000)
                binding.currentTimeStampTextView.text = "time Stamp"
                binding.currentTimeStampButton.setNormal()
            }
        }
    }
}