package com.example.manifest.mvp.data.component;

import com.example.manifest.mvp.data.module.AppModule;
import com.example.manifest.mvp.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    Retrofit retrofit();
}
