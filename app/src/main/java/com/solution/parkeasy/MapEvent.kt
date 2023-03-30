package com.solution.parkeasy

import com.google.android.gms.maps.model.LatLng
import com.solution.parkeasy.domain.model.ParkingSpot

sealed class MapEvent{
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng):MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot):MapEvent()
}
