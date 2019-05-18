package com.example.admin.infinitybeyond;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Admin on 09-03-2019.
 */

public class BloggerAPI {
    private static final String key = "AIzaSyC4zuqUVJ1GwzHVnPWq_PRBuDrLcZqzASE";
    private static final String url = "https://www.googleapis.com/blogger/v3/blogs/7564105967968726104/posts/";

    public static PostService postService = null;
    public static PostService getService(){
        if(postService==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            postService = retrofit.create(PostService.class);
        }
        return postService;
    }
    public interface PostService
    {
        @GET("?key="+key)
        Call<PostList> getPostList();

        ;
    }
}

