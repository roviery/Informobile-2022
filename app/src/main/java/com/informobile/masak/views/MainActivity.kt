package com.informobile.masak.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.informobile.masak.R
import com.informobile.masak.data.Food
import com.informobile.masak.data.FoodData
import com.informobile.masak.databinding.ActivityMainBinding
import com.informobile.masak.views.adapter.FoodAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var rvFood: RecyclerView
    private lateinit var foodAdapter: FoodAdapter
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvFood = binding.rvFood
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        foodAdapter = FoodAdapter(list)

        foodAdapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("NAME", it.name)
            intent.putExtra("DESC", it.desc)
            intent.putExtra("IMAGE", it.image)
            startActivity(intent)
        }

        showRecyclerView()
    }

    private fun showRecyclerView(){
        rvFood.layoutManager = LinearLayoutManager(this)
        rvFood.adapter = foodAdapter
    }
}