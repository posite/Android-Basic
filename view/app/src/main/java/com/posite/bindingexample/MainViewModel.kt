package com.posite.bindingexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class MainViewModel: ViewModel() {
    val _count = MutableLiveData<Int>(0)
    val count :LiveData<Int> get() = _count
    val toCountResult: LiveData<String> = _count.map { count->
        "$count 회"
    }
    val isChecked : MutableLiveData<Boolean> = MutableLiveData<Boolean>(false)

    fun onBtnClick() {
        _count.value = _count.value?.plus(1)
    }

}