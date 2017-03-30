package br.com.fiap.mvpproject.data.component;

import br.com.fiap.mvpproject.data.component.NetComponent;
import br.com.fiap.mvpproject.data.module.MainScreenModule;
import br.com.fiap.mvpproject.mainscreen.MainActivity;
import br.com.fiap.mvpproject.util.CustomScope;
import dagger.Component;

/**
 * Created by logonrm on 29/03/2017.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}
