package com.example.codegen;


import io.swagger.client.ApiClient;
import io.swagger.client.api.AccountsApi;
import io.swagger.client.model.OBReadAccount3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@RestController
@RequestMapping("/makeCallController")
public class Controller {

    private ApiClient apiClient;
    private AccountsApi accountsApi;

    public Controller(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @GetMapping("/methodCall")
    public void methodCall(){
        accountsApi=apiClient.createService(AccountsApi.class);
        Call<OBReadAccount3> call=accountsApi.getAccounts("","","","","",
                "","","");
        call.enqueue(new Callback<OBReadAccount3>() {
            @Override
            public void onResponse(Call<OBReadAccount3> call, Response<OBReadAccount3> response) {
                System.out.println("SUCUCESS "+response);
            }

            @Override
            public void onFailure(Call<OBReadAccount3> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });

    }

}
