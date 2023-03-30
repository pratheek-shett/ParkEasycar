package com.solution.parkeasy.domain.model

import com.solution.parkeasy.data.ParkingSpotEntity

fun ParkingSpotEntity.toParkingSpot(): ParkingSpot{
    return ParkingSpot(lat = lat,lng = lng,id=id)
}

fun ParkingSpot.toParkingSpotEntity(): ParkingSpotEntity{
    return ParkingSpotEntity(lat = lat,lng = lng,id=id)
}