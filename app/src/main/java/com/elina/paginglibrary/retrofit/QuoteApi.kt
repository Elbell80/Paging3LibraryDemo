package com.elina.paginglibrary.retrofit

import com.elina.paginglibrary.models.QuoteList
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApi {
    @GET("/quotes")
    suspend fun getQuotes(
        @Query("page") page: Int
    ) : QuoteList
}