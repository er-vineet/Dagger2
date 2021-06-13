package com.vineet.daggertwo.thirdpartylibrary

import android.util.Log

class LeatherQuality {

    // Assume this class as third party class
    // We can't change it

    var isPremium = false

    fun setLeatherQuality() {
        if (isPremium)
            Log.w("log", "Premium quality leather applied on seats.")
        else
            Log.w("log", "Normal quality leather applied on seats.")
    }

}