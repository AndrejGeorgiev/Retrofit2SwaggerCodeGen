package com.example.codegen;

import io.swagger.client.ApiClient;
import io.swagger.client.api.AccountsApi;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;

@Configuration
public class Retrofit2Config {


    @Bean
    public ApiClient apiClient(){
        ApiClient apiClient=new ApiClient();
        apiClient.createDefaultAdapter();
        return apiClient;
    }


}
