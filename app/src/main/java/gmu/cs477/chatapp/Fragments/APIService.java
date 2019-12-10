package gmu.cs477.chatapp.Fragments;

import gmu.cs477.chatapp.Notifications.MyResponse;
import gmu.cs477.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AIzaSyAvXzKUzrYsaZK8p3va2Y6BOPbKtp9F8aw"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
