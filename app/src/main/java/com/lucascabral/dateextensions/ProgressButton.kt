package com.lucascabral.dateextensions

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.lucascabral.dateextensions.databinding.ProgressButtonBinding

class ProgressButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var title: String? = null
    private var loadingTitle: String? = null

    private val binding = ProgressButtonBinding.inflate(LayoutInflater.from(context), this, true)
}