package br.com.fiap.mvpproject.data.component;


import javax.inject.Singleton;

import br.com.fiap.mvpproject.data.module.AppModule;
import br.com.fiap.mvpproject.data.module.NetModule;
import dagger.Component;
import retrofit2.Retrofit;
/**
 * Created by logonrm on 29/03/2017.
 */

@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface NetComponent {

    Retrofit retrofit();
}
