package com.amir.dependencydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

/*
Why we did this new change.

If we invoke a function like getSmartPhone. We will be able to only get that SmartPhone dependency.
If we wanted get another dependency we would have to create another function in the component interface and invoked it here.
But, now we don’t need to create a specific function for each and every dependency. Instead we can get those dependencies to the MainActivity using field injection.
 as an example if we want ot inject the sim card the only thing that we need is doing this
 @Inject
    lateinit var simCard: SIMCard
 */
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerSmartPhoneComponent.create()
            .inject(this)
        smartPhone.makeACallWithRecording()


    }
}