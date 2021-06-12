package com.vineet.daggertwo.dataclass

import android.util.Log
import javax.inject.Inject

class LicensePlate @Inject constructor(){

    fun attachLicensePlate(car: Car) {
        Log.d("log", "License plate is attached.")
    }

}