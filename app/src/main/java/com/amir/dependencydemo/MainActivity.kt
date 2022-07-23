package com.amir.dependencydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val battery = Battery()
//        val memoryCard = MemoryCard()
//        val serviceProvider = ServiceProvider()
//        val simCard = SIMCard(serviceProvider())
        /*
         here we just constructed a SmartPhone object injecting Battery,MemoryCard and SIMCard objects as dependencies.
         This is dependency injection.
         We injected dependencies to the constructor of the class.
         This type of dependency injection is called Constructor injection.
         */
        // val smartPhone=SmartPhone(battery,simCard, memoryCard)
        //we can write in more efficient way
        val smartPhone = SmartPhone(Battery(), SIMCard(ServiceProvider()), MemoryCard())
        .makeACallWithRecording()

    }
}