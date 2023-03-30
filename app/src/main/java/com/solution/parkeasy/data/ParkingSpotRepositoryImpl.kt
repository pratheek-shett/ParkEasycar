package com.solution.parkeasy.data

import com.solution.parkeasy.domain.model.ParkingSpot
import com.solution.parkeasy.domain.model.toParkingSpot
import com.solution.parkeasy.domain.model.toParkingSpotEntity
import com.solution.parkeasy.domain.repository.ParkingSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepositoryImpl(private val dao: ParkingSpotDao):
    ParkingSpotRepository {
    override suspend fun insertParkingSpot(spot: ParkingSpot) {
        dao.insertParkingSpot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParkingSpot(spot: ParkingSpot) {
        dao.deleteParkingSpot(spot.toParkingSpotEntity())
    }

    override fun getParkingSpots(): Flow<List<ParkingSpot>> {
        return dao.getParkingSpots().map { spots->
            spots.map { it.toParkingSpot() }
        }
    }
}