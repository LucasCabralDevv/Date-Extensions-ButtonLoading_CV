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
                val currentTime = System.currentTimeMillis()
                binding.currentTimeStampTextView.text = currentTime.getTimeStamp()
                binding.currentTimeStampButton.setNormal()
            }
        }

        binding.yearMonthDayButton.setOnClickListener {
            //Todo
        }

        binding.dateUnixTimeButton.setOnClickListener {
            //Todo
        }
    }
}