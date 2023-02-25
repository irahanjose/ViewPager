package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var  fragmentsAdapter : FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    fragmentsAdapter = FragmentAdapter(supportFragmentManager, lifecycle)
    binding.viewPager.adapter = fragmentsAdapter

    val titles = arrayOf("Inicio", "Carrito","Favoritos")

        TabLayoutMediator(binding.tabLayout, binding.viewPager){tab, pos ->
            tab.text = titles[pos]
        }.attach()
    }
}