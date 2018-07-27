package com.jorgereina.daggerpractice;

import android.app.Application;

import timber.log.Timber;

public class DIApp extends Application {

    DIAppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        appComponent = DaggerDIAppComponent
                .builder()
                .dIAppModule(new DIAppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }

    public DIAppComponent getAppComponent() {
        return appComponent;
    }
}
