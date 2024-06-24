package com.example.effmobapp0624.presentation.rvadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.effmobapp0624.R
import com.example.effmobapp0624.databinding.ItemToFirstScreenBinding
import com.example.effmobapp0624.domain.entity.entity_first_screen.City

class ItemListAdapterForFirstScreen : ListAdapter<City, ItemListAdapterForFirstScreen.Holder>(Comparator()) {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemToFirstScreenBinding.bind(view)

        private val imageResources = arrayOf(
            R.drawable.image_for_card_firstscreen_1,
            R.drawable.image_for_card_firstscreen_2,
            R.drawable.image_for_card_firstscreen_3
        )

        fun bind(city: City) = with(binding) {
            tvItemTitle.text = city.title
            tvItemTown.text = city.town
            priceValueCardInFirstScreen.text = "от ${city.price.value.toString()} ₽"
            imageItem.setImageResource(imageResources[position % imageResources.size])
        }
    }

    class Comparator : DiffUtil.ItemCallback<City>() {
        override fun areItemsTheSame(oldItem: City, newItem: City): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: City, newItem: City): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_to_first_screen,
            parent,
            false
        )
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))


    }
}