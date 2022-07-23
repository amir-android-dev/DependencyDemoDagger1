package com.amir.dependencydemo

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    init {
        Log.i("MYTAG","Battery Constructed")
    }

    fun getPower(){
        Log.i("MYTAG","Battery power is available")
    }
}