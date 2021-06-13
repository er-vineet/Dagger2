package com.vineet.daggertwo.dependencyinjection

import com.vineet.daggertwo.dataclass.Battery
import com.vineet.daggertwo.dataclass.DryCellBattery
import dagger.Binds
import dagger.Module

@Module
interface DryCellModule {

    @Binds
    fun bindBattery(dryCellBattery: DryCellBattery) : Battery

}