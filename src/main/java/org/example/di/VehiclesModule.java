package org.example.di;

import dagger.Module;
import dagger.Provides;
import org.example.models.Engine;
import org.example.models.Wheels;

import javax.inject.Singleton;

@Module
public class VehiclesModule {
    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    @Singleton
    public Wheels provideBrand() {
        return new Wheels();
    }
}
