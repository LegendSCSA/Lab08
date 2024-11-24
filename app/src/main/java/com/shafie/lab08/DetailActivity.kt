package com.shafie.lab08

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shafie.lab08.databinding.ActivityDetailBinding
import com.google.android.material.snackbar.Snackbar

class DetailActivity : AppCompatActivity() {

    private var rating: Int = 0
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val size = intent.getStringExtra("size")
        val date = intent.getStringExtra("date")
        val time = intent.getStringExtra("time")


        binding.nameTextView.text = name
        binding.phoneTextView.text = phone
        binding.sizeTextView.text = size
        binding.dateTextView.text = date
        binding.timeTextView.text = time

        binding.sendBtn.setOnClickListener {
            rating = binding.ratingBar.rating.toInt()
            binding.ratingTextView.text = rating.toString()

            //show the snackbar after user's rating
            //snackbar.make(view,"Thank you for your rating, we really appreciate it",snackbar.LENGTH_LONG).show()

            Snackbar.make(view,"Thank you for your rating",Snackbar.LENGTH_LONG).setAction("Action"){
                println("User pressed OK")}.show()
        }

        }
    }