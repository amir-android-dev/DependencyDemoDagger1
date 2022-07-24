package com.amir.dependencydemo

import dagger.Component
import javax.inject.Singleton

/*
In our demo project, to get the SmartPhone dependency,
 we have invoked this getSmartPhone function of the smartPhoneComponent interface form the MainActivity,
 But this is not the best and most efficient way of doing it.
 There can be many activities and fragments in a project.
 If you have 10 required dependencies like this SmartPhone dependency, you may have to write getter methods for all of them
 in the component interface. And you will have to call to them form all activities in this way.
 */
@Singleton
@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
   //we dont have to write getter method like this
    //we can get injected all dependencies belong to the dependency graph
  //  fun getSmartPhone():SmartPhone
    //we can use every name for it but as a convention we make use of inject
    /*
    If in case you need to use this component in 3 activities and one fragment,
     you may need to write 3 more inject functions here with those activities and fragment as parameters.
     */
    fun inject(mainActivity: MainActivity)


}