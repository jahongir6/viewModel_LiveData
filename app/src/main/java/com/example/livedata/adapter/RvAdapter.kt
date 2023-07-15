package com.example.livedata.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.livedata.databinding.ItemRvBinding
import com.example.livedata.models.LiveDataGEtResponse

class RvAdapter(var list: ArrayList<LiveDataGEtResponse>) : RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(liveDataGEtResponse: LiveDataGEtResponse,position: Int) {
            itemRvBinding.tvName.text = liveDataGEtResponse.sarlavha
            itemRvBinding.tvPrice.text = liveDataGEtResponse.batafsil
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

}