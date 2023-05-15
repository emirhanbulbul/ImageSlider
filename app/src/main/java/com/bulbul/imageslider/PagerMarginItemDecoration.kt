package com.bulbul.imageslider

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.annotation.DimenRes
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Emirhan Bülbül on 30.04.2023
 */
class PagerMarginItemDecoration(margin: Int) :
    RecyclerView.ItemDecoration() {
    private val marginHorizontal: Int = margin
    override fun getItemOffsets(
        outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view)
        if(position != state.itemCount - 1){
            outRect.right = marginHorizontal
        }
    }
}