package com.amir.dependencydemo

import android.util.Log
import javax.inject.Inject

//here we implement the battery interface
/* if we run the app it shows an error
Here we have a dependency of NickelCadmiumBattery.
 As it has implemented Battery interface we know this is a Battery.
 But dagger does not know that yet.
 dagger does not cast for dependencies in that way
 We have to create a module and provide this NickelCadmiumBattery dependency as a Battery dependency.
 */
class NickelCadmiumBattery @Inject constructor(): Battery{
    override fun getPower() {
        Log.i("MYTAG","Power from NickelCadmiumBattery ")
    }
}