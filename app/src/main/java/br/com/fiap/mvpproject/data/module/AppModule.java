package br.com.fiap.mvpproject.data.module;

import android.app.Application;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by logonrm on 29/03/2017.
 */
@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application mApplication){
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return mApplication;
    }
}

