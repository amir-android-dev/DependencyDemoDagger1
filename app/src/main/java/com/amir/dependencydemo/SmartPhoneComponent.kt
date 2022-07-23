package com.amir.dependencydemo

import dagger.Component

/*to use dagger 2 generated codes for dependency injection
we also need an interface annotated with @Component annotation.  */

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
    //an abstract function to get the dependency we want
    //the name of function is not important
    //the return type function must be the type of the dependency we want
    fun getSmartPhone():SmartPhone
//we have to link our module to this component


}