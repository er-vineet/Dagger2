package com.vineet.daggertwo.dataclass

import android.util.Log
import javax.inject.Inject

class DryCellBattery @Inject constructor() : Battery {

    override fun ignite() {
        Log.d("log", "DryCell Battery is ready.")
    }

}