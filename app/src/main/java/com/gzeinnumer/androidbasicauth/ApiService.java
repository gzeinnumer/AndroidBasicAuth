package com.gzeinnumer.androidbasicauth;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

interface ApiService {
    @GET("test")
    Call<ResponseData> testBasic(@Header("Authorization") String auth);
}
