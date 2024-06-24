package com.example.effmobapp0624.presentation.rvadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.effmobapp0624.R
import com.example.effmobapp0624.databinding.ItemToSecondScreenBinding
import com.example.effmobapp0624.domain.entity.entity_second_screen.TicketsOffers

class ItemListAdapterForSecondScreen :
    ListAdapter<TicketsOffers, ItemListAdapterForSecondScreen.Holder>(Comparator()) {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemToSecondScreenBinding.bind(view)

        private val imageResources = arrayOf(
            R.drawable.circle_red,
            R.drawable.circle_blue,
            R.drawable.circle_white
        )

        fun bind(ticketsOffers: TicketsOffers) = with(binding) {
            tvTitleSecondScreen.text = ticketsOffers.title
            priceValueCardInSecondScreen.text = "${ticketsOffers.price.value.toString()} ₽ >"
            timeRange.text = ticketsOffers.timeRange.toString()
            iconCircle.setImageResource(imageResources[position % imageResources.size])
        }
    }

    class Comparator : DiffUtil.ItemCallback<TicketsOffers>() {
        override fun areItemsTheSame(oldItem: TicketsOffers, newItem: TicketsOffers): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: TicketsOffers, newItem: TicketsOffers): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_to_second_screen,
            parent,
            false
        )
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))
    }

}