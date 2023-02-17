package com.elina.paginglibrary.paging

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.elina.paginglibrary.R

class LoaderAdapter : LoadStateAdapter<LoaderAdapter.LoaderVH>() {
    class LoaderVH(val view: View) : RecyclerView.ViewHolder(view) {
        val progressBar = view.findViewById<ProgressBar>(R.id.prbLoader)

        fun bind(loadState : LoadState){
            progressBar.isVisible = loadState is LoadState.Loading
        }
    }

    override fun onBindViewHolder(holder: LoaderVH, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoaderVH {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_loader, parent, false)
        return LoaderVH(view)
    }
}