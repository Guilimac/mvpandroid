package br.com.fiap.mvpproject.data.module;

import br.com.fiap.mvpproject.mainscreen.MainScreenContract;
import br.com.fiap.mvpproject.util.CustomScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by logonrm on 29/03/2017.
 */
@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;

    public MainScreenModule(MainScreenContract.View mView){
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView(){
        return mView;
    }
}
