package com.posite.bindingexample

import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

@BindingAdapter("app:progress")
fun setProgress(progressBar: ProgressBar, progress: Int) {
    progressBar.progress = progress
}