package com.plcoding.mapscomposeguide.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/plcoding/mapscomposeguide/data/ParkingSpotRepositoryImpl;", "Lcom/plcoding/mapscomposeguide/domain/repository/ParkingSpotRepository;", "dao", "Lcom/plcoding/mapscomposeguide/data/ParkingSpotDao;", "(Lcom/plcoding/mapscomposeguide/data/ParkingSpotDao;)V", "deleteParkingSpot", "", "spot", "Lcom/plcoding/mapscomposeguide/domain/model/ParkingSpot;", "(Lcom/plcoding/mapscomposeguide/domain/model/ParkingSpot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParkingSpots", "Lkotlinx/coroutines/flow/Flow;", "", "insertParkingSpot", "app_debug"})
public final class ParkingSpotRepositoryImpl implements com.plcoding.mapscomposeguide.domain.repository.ParkingSpotRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.plcoding.mapscomposeguide.data.ParkingSpotDao dao = null;
    
    public ParkingSpotRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.plcoding.mapscomposeguide.data.ParkingSpotDao dao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertParkingSpot(@org.jetbrains.annotations.NotNull()
    com.plcoding.mapscomposeguide.domain.model.ParkingSpot spot, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteParkingSpot(@org.jetbrains.annotations.NotNull()
    com.plcoding.mapscomposeguide.domain.model.ParkingSpot spot, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.plcoding.mapscomposeguide.domain.model.ParkingSpot>> getParkingSpots() {
        return null;
    }
}