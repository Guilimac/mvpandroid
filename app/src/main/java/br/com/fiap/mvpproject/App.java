package br.com.fiap.mvpproject;

import android.app.Application;

import br.com.fiap.mvpproject.data.component.DaggerNetComponent;
import br.com.fiap.mvpproject.data.component.NetComponent;
import br.com.fiap.mvpproject.data.module.AppModule;
import br.com.fiap.mvpproject.data.module.NetModule;

/**
 * Created by logonrm on 29/03/2017.
 */

public class App extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent(){
        return mNetComponent;
    }
}
