package com.informobile.masak.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.informobile.masak.R
import com.informobile.masak.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("NAME")
        val desc = intent.getStringExtra("DESC")
        val image = intent.getIntExtra("IMAGE", 0)

        binding.detailName.text = name
        binding.detailDesc.text = desc

        Glide.with(this)
            .load(image)
            .centerCrop()
            .into(binding.detailThumbnail)
    }

    companion object{
        const val NAME = "STRING"
        const val DESC = "STRING"
        const val IMAGE = 0
    }
}