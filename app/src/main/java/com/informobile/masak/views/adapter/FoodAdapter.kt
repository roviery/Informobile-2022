package com.informobile.masak.views.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.informobile.masak.R
import com.informobile.masak.data.Food
import com.informobile.masak.databinding.ListItemBinding

class FoodAdapter(private val listFood: ArrayList<Food>): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    var onItemClick: ((Food) -> Unit)? = null

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ListItemBinding.bind(itemView)
        fun bind(data: Food){
            with(binding){
                itemName.text = data.name
                Glide.with(itemView.context)
                    .load(data.image)
                    .centerCrop()
                    .circleCrop()
                    .into(itemImage)
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listFood[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodAdapter.FoodViewHolder, position: Int) {
        val food = listFood[position]
        holder.bind(food)
    }

    override fun getItemCount(): Int = listFood.size

}