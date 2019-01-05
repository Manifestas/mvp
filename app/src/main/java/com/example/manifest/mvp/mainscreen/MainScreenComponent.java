package com.example.manifest.mvp.mainscreen;

import com.example.manifest.mvp.data.component.NetComponent;
import com.example.manifest.mvp.util.CustomScope;

import dagger.Component;

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {

    void inject(MainActivity mainActivity);

}
