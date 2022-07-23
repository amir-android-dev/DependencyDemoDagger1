package com.amir.dependencydemo

import dagger.Component

/*to use dagger 2 generated codes for dependency injection
we also need an interface annotated with @Component annotation.  */
@Component
interface SmartPhoneComponent {
    //an abstract function to get the dependency we want
    //the name of function is not importent
    //the return type function must be the type of the dependency we want
    fun getSmartPhone():SmartPhone
}