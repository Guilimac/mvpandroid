package br.com.fiap.mvpproject.mainscreen;

import java.util.List;

import br.com.fiap.mvpproject.data.model.Post;

/**
 * Created by logonrm on 29/03/2017.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);
        void showError(String message);
        void showComplete();
    }

    interface Presenter{
        void loadPost();
    }
}
