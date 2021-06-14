package com.rsschool.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.rsschool.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener {

        }
       var viewPeger= binding.viewPeger
        viewPeger.adapter=ViewPegerAdapter(supportFragmentManager)

        
    }
    inner class ViewPegerAdapter(fm : FragmentManager):FragmentPagerAdapter(fm)
    {
        override fun getCount(): Int {
          return 5
        }

        override fun getItem(position: Int): Fragment {



        }

    }
}