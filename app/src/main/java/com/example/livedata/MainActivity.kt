package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.adapter.RvAdapter
import com.example.livedata.databinding.ActivityMainBinding
import com.example.livedata.viewModel.MyViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var myViewModel: MyViewModel
    private lateinit var rvAdapter: RvAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        myViewModel.getUserList().observe(this, {
            Toast.makeText(this, "salom", Toast.LENGTH_SHORT).show()
            rvAdapter = RvAdapter(it)
            binding.rv.adapter = rvAdapter
        });
    }
}