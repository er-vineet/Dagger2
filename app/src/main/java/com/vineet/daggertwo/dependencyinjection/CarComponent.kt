package com.vineet.daggertwo.dependencyinjection

import com.vineet.daggertwo.MainActivity
import com.vineet.daggertwo.dataclass.Car
import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}