package com.vineet.daggertwo.dataclass

import android.util.Log
import javax.inject.Inject

class WetCellBattery @Inject constructor() : Battery {

    override fun ignite() {
        Log.d("log", "WetCell Battery is ready.")
    }

}