package com.amir.dependencydemo

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize:Int) {

    @Provides
    fun providesMemoryCard():MemoryCard{
        Log.i("MyTAG","The Memory size is $memorySize")
        return MemoryCard()
    }
}