package br.com.fiap.mvpproject.data.api;


import java.util.List;

import br.com.fiap.mvpproject.data.model.Post;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by logonrm on 29/03/2017.
 */

public interface PostAPI {
    @GET("/posts")
    Observable<List<Post>> getPostList();
}
