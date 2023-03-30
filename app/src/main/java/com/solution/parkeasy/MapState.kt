package com.solution.parkeasy

import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties
import com.solution.parkeasy.domain.model.ParkingSpot

data class MapState(
    val properties: MapProperties = MapProperties(mapStyleOptions = MapStyleOptions(MapStyle.json)),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap:Boolean = false
)
