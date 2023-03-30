package com.plcoding.mapscomposeguide;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/plcoding/mapscomposeguide/MapsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/plcoding/mapscomposeguide/domain/repository/ParkingSpotRepository;", "(Lcom/plcoding/mapscomposeguide/domain/repository/ParkingSpotRepository;)V", "<set-?>", "Lcom/plcoding/mapscomposeguide/MapState;", "state", "getState", "()Lcom/plcoding/mapscomposeguide/MapState;", "setState", "(Lcom/plcoding/mapscomposeguide/MapState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "onEvent", "", "event", "Lcom/plcoding/mapscomposeguide/MapEvent;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MapsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.plcoding.mapscomposeguide.domain.repository.ParkingSpotRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject()
    public MapsViewModel(@org.jetbrains.annotations.NotNull()
    com.plcoding.mapscomposeguide.domain.repository.ParkingSpotRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.plcoding.mapscomposeguide.MapState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.plcoding.mapscomposeguide.MapState p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.plcoding.mapscomposeguide.MapEvent event) {
    }
}