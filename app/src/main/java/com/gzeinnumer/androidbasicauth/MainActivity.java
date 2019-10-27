package com.gzeinnumer.androidbasicauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String strUsername = "admin";
        String strPassword = "admin";

        String base = strUsername+":"+strPassword;
        String authHeader = "Basic " + Base64.encodeToString(base.getBytes(), Base64.NO_WRAP);
        RetroServer.getInstance().testBasic(authHeader).enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                Log.d("ZEIN_ONGOING","SUKSES " + response.code());
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
                Log.d("ZEIN_ONGOING","GAGAL " + t.getMessage());
            }
        });

    }
}
