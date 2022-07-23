package com.amir.dependencydemo

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard():MemoryCard{
        return MemoryCard()
    }
}