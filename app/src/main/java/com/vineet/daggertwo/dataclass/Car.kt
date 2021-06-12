package com.vineet.daggertwo.dataclass

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(var engine: Engine, var battery: Battery) {

    fun drive() {
        battery.ignite()
        engine.start()

        Log.i("log", "Grrrr.. Car is driving.")
    }

    @Inject
    fun attachLicensePlate(licensePlate: LicensePlate) {
        licensePlate.attachLicensePlate(this)
    }

}
