package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.FragmentOne.setOnClickListener{

            replaceFragment(Fragment1())
        }

        binding.FragmentTwo.setOnClickListener {

            replaceFragment(Fragment2())
        }
    }
    fun replaceFragment(fragment: Fragment){

        val fragmentManeger = supportFragmentManager
        val fragmentTransaction = fragmentManeger.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container_view_first,fragment)
        fragmentTransaction.commit()

    }
}