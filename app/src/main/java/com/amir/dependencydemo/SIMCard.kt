package com.amir.dependencydemo

import android.util.Log
import javax.inject.Inject

/*
You can see To construct a SimCard instace,we need to provide a service provider instance as a dependency to it.
 SimCard has a function named getConnection(). Inside getConnection()
 we have written codes to invoke the getServiceProvider function of the ServiceProvider class.
 */
class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {


    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

//    fun setServiceProvider(serviceProvider: ServiceProvider){
//        this.serviceProvider = serviceProvider
//    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}
