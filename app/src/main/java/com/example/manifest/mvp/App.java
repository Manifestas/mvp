package com.example.manifest.mvp;

import android.app.Application;

import com.example.manifest.mvp.data.component.DaggerNetComponent;
import com.example.manifest.mvp.data.component.NetComponent;
import com.example.manifest.mvp.data.module.AppModule;
import com.example.manifest.mvp.data.module.NetModule;

public class App extends Application {

    private static final String baseUrl = "http://jsonplaceholder.typicode.com/";

    public NetComponent getNetComponent() {
        return netComponent;
    }

    private NetComponent netComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(baseUrl))
                .build();
    }
}
