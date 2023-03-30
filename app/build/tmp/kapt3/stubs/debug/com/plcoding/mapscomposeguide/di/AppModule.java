package com.plcoding.mapscomposeguide.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/plcoding/mapscomposeguide/di/AppModule;", "", "()V", "provideParkingSpotDatabase", "Lcom/plcoding/mapscomposeguide/data/ParkingSpotDatabase;", "app", "Landroid/app/Application;", "provideParkingSpotRepository", "Lcom/plcoding/mapscomposeguide/domain/repository/ParkingSpotRepository;", "db", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.plcoding.mapscomposeguide.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.plcoding.mapscomposeguide.data.ParkingSpotDatabase provideParkingSpotDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.plcoding.mapscomposeguide.domain.repository.ParkingSpotRepository provideParkingSpotRepository(@org.jetbrains.annotations.NotNull()
    com.plcoding.mapscomposeguide.data.ParkingSpotDatabase db) {
        return null;
    }
}