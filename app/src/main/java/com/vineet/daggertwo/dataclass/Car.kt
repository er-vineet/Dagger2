package com.vineet.daggertwo.dataclass

import android.util.Log
import com.vineet.daggertwo.thirdpartylibrary.Seats
import javax.inject.Inject

data class Car @Inject constructor(var engine: Engine, var battery: Battery, var seats: Seats) {

    fun drive() {
        battery.ignite()
        engine.start()
        seats.attachSeats()

        Log.i("log", "Grrrr.. Car is driving.")
    }

    @Inject
    fun attachLicensePlate(licensePlate: LicensePlate) {
        licensePlate.attachLicensePlate(this)
    }

}
