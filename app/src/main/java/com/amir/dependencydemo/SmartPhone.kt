package com.amir.dependencydemo

import android.util.Log
import javax.inject.Inject

/*
In Kotlin primary constructor is invisible.
But we need a visible constructor to annotate it with inject annotation
we use the explicit word constructor to annotate it with inject annotation
 */
/*
what we did is called constructor injection
it is recommended to use constructor injection for every possible scenario
 */
class SmartPhone @Inject constructor(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {

    init {
        Log.i("MYTAG", "SmartPhone Constructed")
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
    }

    fun makeACallWithRecording() {
        Log.i("MYTAG", "Calling.....")
    }
}
