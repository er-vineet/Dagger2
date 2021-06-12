package com.vineet.daggertwo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vineet.daggertwo.dataclass.Car
import com.vineet.daggertwo.dependencyinjection.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCarComponent.create().inject(this)
        car.drive()
    }

}