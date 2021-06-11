package com.vineet.daggertwo.dataclass

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    fun start() {
        Log.d("log", "Engine has started.")
    }

}
