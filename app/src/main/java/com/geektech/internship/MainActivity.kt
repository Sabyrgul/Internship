package com.geektech.internship

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.internship.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        binding?.btnClick?.setOnClickListener(){
        }
    }
}