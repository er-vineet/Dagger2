package com.vineet.daggertwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vineet.daggertwo.dataclass.Car
import com.vineet.daggertwo.dataclass.Engine
import com.vineet.daggertwo.dependencyinjection.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car: Car = DaggerCarComponent.create().getCar()
        car.drive()
    }

}