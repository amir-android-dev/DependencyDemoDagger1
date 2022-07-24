package com.amir.dependencydemo

import android.app.Application

class SmartPhoneApplication:Application() {

    lateinit var smartPhoneComponent: SmartPhoneComponent

    override fun onCreate() {
        smartPhoneComponent=initDagger()
        super.onCreate()
    }

    //creating a function to initialize dagger related to components
    private fun initDagger():SmartPhoneComponent=
        DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()


}