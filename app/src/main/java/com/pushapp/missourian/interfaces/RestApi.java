package com.pushapp.missourian.interfaces;

import com.pushapp.missourian.model.ArticlePost;

import retrofit.Callback;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * @author Bryan Lamtoo.
 */
public interface RestApi {

    @GET("/articles.json")
    void getArticles(@Query("installation_uuid")String installation_uuid, Callback<ArticlePost> response);

    @GET("/articles.json")
    void getArticles(@Query("installation_uuid")String installation_uuid, Callback<ArticlePost> response, @Query("categories")boolean categories);

    @GET("/articles.json")
    void getArticles(@Query("installation_uuid")String installation_uuid, @Query("language")String language, Callback<ArticlePost> response);

    @GET("/articles.json")
    void getArticles(@Query("installation_uuid")String installation_uuid, @Query("language")String language, @Query("categories")boolean categories, Callback<ArticlePost> response);

    @GET("/articles.json")
    void getArticles(@Query("installation_uuid")String installation_uuid, @Query("start_date")long start_date,@Query("end_date")long end_date,@Query("pages")int pages,@Query("page_size")int page_size, Callback<ArticlePost> response);

    @GET("/articles.json")
    void getArticles(@Query("installation_uuid")String installation_uuid, @Query("categories")boolean categories, @Query("start_date")long start_date,@Query("end_date")long end_date,@Query("pages")int pages,@Query("page_size")int page_size, Callback<ArticlePost> response);

    @GET("/articles.json")
    void getArticles(@Query("installation_uuid")String installation_uuid, @Query("start_date")long start_date,@Query("end_date")long end_date,@Query("pages")int pages,@Query("page_size")int page_size, @Query("language")String language ,Callback<ArticlePost> response);

    @GET("/articles.json")
    void getArticles(@Query("installation_uuid")String installation_uuid, @Query("categories")boolean categories,@Query("start_date")long start_date,@Query("end_date")long end_date,@Query("pages")int pages,@Query("page_size")int page_size, @Query("language")String language ,Callback<ArticlePost> response);

    @GET("/search.json")
    void searchArticles(@Query("installation_uuid")String installation_uuid, @Query("q")String query,@Query("start_date")long start_date,@Query("end_date")long end_date,@Query("pages")int pages,@Query("page_size")int page_size,Callback<ArticlePost> response);

    @GET("/search.json")
    void searchArticles(@Query("installation_uuid")String installation_uuid, @Query("q")String query,@Query("start_date")long start_date,@Query("end_date")long end_date,@Query("pages")int pages,@Query("page_size")int page_size,@Query("language")String language,Callback<ArticlePost> response);

    @GET("/article.json")
    void getArticle(@Query("installation_uuid")String installation_uuid, @Query("id")String id, Callback<ArticlePost> response);

    @GET("/article.json")
    void getArticle(@Query("installation_uuid")String installation_uuid, @Query("id")String id,@Query("language")String language, Callback<ArticlePost> response);
}
