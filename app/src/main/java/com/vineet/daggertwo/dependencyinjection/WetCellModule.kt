package com.vineet.daggertwo.dependencyinjection

import com.vineet.daggertwo.dataclass.Battery
import com.vineet.daggertwo.dataclass.WetCellBattery
import dagger.Binds
import dagger.Module

@Module
interface WetCellModule {

    @Binds
    fun bindBattery(wetCellBattery: WetCellBattery) : Battery

}