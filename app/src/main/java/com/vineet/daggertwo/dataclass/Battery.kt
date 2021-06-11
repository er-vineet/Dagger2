package com.vineet.daggertwo.dataclass

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {

    fun ignite() {
        Log.d("log", "Battery is ready.")
    }

}
