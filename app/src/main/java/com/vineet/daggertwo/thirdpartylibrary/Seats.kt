package com.vineet.daggertwo.thirdpartylibrary

import android.util.Log

class Seats (private val leatherQuality: LeatherQuality) {

    // Assume this class as third party class
    // We can't change it

    fun attachSeats() {
        leatherQuality.setLeatherQuality()
        Log.w("log", "Seats are attached.")
    }

}