package com.plcoding.mapscomposeguide;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/plcoding/mapscomposeguide/MapEvent;", "", "()V", "OnInfoWindowLongClick", "OnMapLongClick", "ToggleFalloutMap", "Lcom/plcoding/mapscomposeguide/MapEvent$OnInfoWindowLongClick;", "Lcom/plcoding/mapscomposeguide/MapEvent$OnMapLongClick;", "Lcom/plcoding/mapscomposeguide/MapEvent$ToggleFalloutMap;", "app_debug"})
public abstract class MapEvent {
    
    private MapEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/plcoding/mapscomposeguide/MapEvent$OnInfoWindowLongClick;", "Lcom/plcoding/mapscomposeguide/MapEvent;", "spot", "Lcom/plcoding/mapscomposeguide/domain/model/ParkingSpot;", "(Lcom/plcoding/mapscomposeguide/domain/model/ParkingSpot;)V", "getSpot", "()Lcom/plcoding/mapscomposeguide/domain/model/ParkingSpot;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnInfoWindowLongClick extends com.plcoding.mapscomposeguide.MapEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.plcoding.mapscomposeguide.domain.model.ParkingSpot spot = null;
        
        public OnInfoWindowLongClick(@org.jetbrains.annotations.NotNull()
        com.plcoding.mapscomposeguide.domain.model.ParkingSpot spot) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.plcoding.mapscomposeguide.domain.model.ParkingSpot getSpot() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.plcoding.mapscomposeguide.domain.model.ParkingSpot component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.plcoding.mapscomposeguide.MapEvent.OnInfoWindowLongClick copy(@org.jetbrains.annotations.NotNull()
        com.plcoding.mapscomposeguide.domain.model.ParkingSpot spot) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/plcoding/mapscomposeguide/MapEvent$OnMapLongClick;", "Lcom/plcoding/mapscomposeguide/MapEvent;", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "(Lcom/google/android/gms/maps/model/LatLng;)V", "getLatLng", "()Lcom/google/android/gms/maps/model/LatLng;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnMapLongClick extends com.plcoding.mapscomposeguide.MapEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.gms.maps.model.LatLng latLng = null;
        
        public OnMapLongClick(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng latLng) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.maps.model.LatLng getLatLng() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.maps.model.LatLng component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.plcoding.mapscomposeguide.MapEvent.OnMapLongClick copy(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng latLng) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/plcoding/mapscomposeguide/MapEvent$ToggleFalloutMap;", "Lcom/plcoding/mapscomposeguide/MapEvent;", "()V", "app_debug"})
    public static final class ToggleFalloutMap extends com.plcoding.mapscomposeguide.MapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.plcoding.mapscomposeguide.MapEvent.ToggleFalloutMap INSTANCE = null;
        
        private ToggleFalloutMap() {
        }
    }
}