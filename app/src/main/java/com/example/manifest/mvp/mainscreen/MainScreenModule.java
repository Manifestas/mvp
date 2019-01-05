package com.example.manifest.mvp.mainscreen;

import com.example.manifest.mvp.util.CustomScope;

import dagger.Module;
import dagger.Provides;

@Module
public class MainScreenModule {

    private final MainScreenContract.View view;

    public MainScreenModule(MainScreenContract.View view) {
        this.view = view;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return view;
    }
}
