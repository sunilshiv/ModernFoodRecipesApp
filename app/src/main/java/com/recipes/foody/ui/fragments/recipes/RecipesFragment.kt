package com.recipes.foody.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.facebook.shimmer.ShimmerFrameLayout
import com.recipes.foody.R

class RecipesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipes, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showShimmerEffect()
    }

    private fun showShimmerEffect() {

        val shimmerFragmeLayout = view?.findViewById<ShimmerFrameLayout>(R.id.shimmer_recycler_view)
        shimmerFragmeLayout?.startShimmer()
        // binding.shimmerFragmeLayout.startShimmer()
        // recyclerView.Visibility = View.Gone
    }

    private fun hideShimmerEffect() {
        //binding.shimmerFrameLayout.stopShimmer()
        //recyclerView.Visibilty = View.GONE
    }

}