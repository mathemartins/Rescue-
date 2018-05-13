package com.populargeng.trackamechanic.Remote;

import com.populargeng.trackamechanic.Model.FCMResponse;
import com.populargeng.trackamechanic.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by mathemartins on 3/31/2018.
 */

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAUSpRqjM:APA91bHof2cq76ieSdeBFIFVAMd17iby7APRhG0pIBqVU9WZJJf3Ptajco6ByK3y7z_iXYX_Waf4aAZ2z1NcUqxYiwLbIrxemmwlUqBwyKN5pNJGfnpgLCqzAuJaM1Ycpfior2_ODqoa"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
