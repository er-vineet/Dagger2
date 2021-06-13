package com.vineet.daggertwo.dependencyinjection

import com.vineet.daggertwo.thirdpartylibrary.LeatherQuality
import com.vineet.daggertwo.thirdpartylibrary.Seats
import dagger.Module
import dagger.Provides

@Module
object SeatModule {

    @Provides
    fun provideLeatherQuality() : LeatherQuality {
        val leatherQuality = LeatherQuality()
        leatherQuality.isPremium = true
        return leatherQuality
    }

    @Provides
    fun provideSeats(leatherQuality: LeatherQuality) : Seats {
        return Seats(leatherQuality)
    }

}