package com.example.kaninistocks

import com.example.kaninistocks.userData.LoginDetails
import com.example.kaninistocks.userData.UserDetails
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface HttpApiService {
    @POST("/login")
    suspend fun userLogin(@Body details:LoginDetails):Response<UserDetails>

@POST("users/me/email")
suspend fun changeEmail(@Body details:LoginDetails):Response<ChangeEmailDao>
    //URL: GET https://android-kanini-course.cloud/priceapp-secure-backend/users/me/loginHistory

    @GET("users/me/loginHistory")
    suspend fun LoginHistory(@Body details:LoginDetails):Response<LoginHistoryActivity>
    abstract fun getBooks(): Any
}