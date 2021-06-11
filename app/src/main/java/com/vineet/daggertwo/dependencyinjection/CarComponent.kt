package com.vineet.daggertwo.dependencyinjection

import com.vineet.daggertwo.dataclass.Car
import dagger.Component

@Component
interface CarComponent {  //Also be known as CarInjector

    fun getCar(): Car

}