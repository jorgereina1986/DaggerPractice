package com.jorgereina.daggerpractice;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DIAppModule {

    private final DIApp app;

    public DIAppModule(DIApp app) {
        this.app = app;
    }

    @Provides
    @Singleton
    @ForApplication
    Context provideApplication() {
        return app;
    }
}
