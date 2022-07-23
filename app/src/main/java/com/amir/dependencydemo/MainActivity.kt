package com.amir.dependencydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
after dagger and dependencies we have to rebuild our project
 */
/*
You can see dagger has created factory classes for each dependency.
 And for the component interface dagger has created a class named DaggerSmartPhoneComponnent implementing the interface.
  When generating a class which implements component interface, dagger always include the word Dagger in front of the interface name.
 */
class MainActivity : AppCompatActivity() {
    private lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          DaggerSmartPhoneComponent.create()
              .getSmartPhone()
              .makeACallWithRecording()
//        val battery = Battery()
//        val memoryCard = MemoryCard()
//        val serviceProvider = ServiceProvider()
//        val simCard = SIMCard(serviceProvider())

        // val smartPhone=SmartPhone(battery,simCard, memoryCard)

//        val smartPhone = SmartPhone(Battery(), SIMCard(ServiceProvider()), MemoryCard())
//        .makeACallWithRecording()

    }
}