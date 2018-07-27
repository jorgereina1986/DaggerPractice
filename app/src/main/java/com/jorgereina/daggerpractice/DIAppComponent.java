package com.jorgereina.daggerpractice;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {DIAppModule.class, NetworkModule.class}
)
public interface DIAppComponent {
    void inject(DIApp diApp);

    void inject(MainActivity mainActivity);
}
