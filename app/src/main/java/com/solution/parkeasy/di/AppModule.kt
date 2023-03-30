package com.solution.parkeasy.di

import android.app.Application
import androidx.room.Room
import com.solution.parkeasy.data.ParkingSpotDatabase
import com.solution.parkeasy.data.ParkingSpotRepositoryImpl
import com.solution.parkeasy.domain.repository.ParkingSpotRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app:Application):ParkingSpotDatabase{
       return Room.databaseBuilder(app,ParkingSpotDatabase::class.java,"parking_spots.db").build()
    }
    @Singleton
    @Provides
    fun provideParkingSpotRepository(db:ParkingSpotDatabase): ParkingSpotRepository{
        return ParkingSpotRepositoryImpl(db.dao)
    }
}