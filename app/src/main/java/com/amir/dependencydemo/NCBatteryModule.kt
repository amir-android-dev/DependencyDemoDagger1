package com.amir.dependencydemo

import dagger.Binds
import dagger.Module
import dagger.Provides
/*
In our app, we have already annotated the constructor of the NickelCadmiumBattery class with inject annotatin.
Therefore we don’t need a body for this provides function. So we can just define this module as an abstract module. then make this function as abstract. And remove the function body.
 */
@Module
abstract class NCBatteryModule {
//abstract fun cannot be annotated with provides
    @Binds
  abstract  fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery):Battery
}