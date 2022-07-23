package com.amir.dependencydemo

import android.util.Log
import dagger.Module
import javax.inject.Inject

class MemoryCard{
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}
