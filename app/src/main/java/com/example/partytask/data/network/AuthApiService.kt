package com.example.partytask.data.network



import com.example.partytask.data.model.LogInForm
import com.example.partytask.data.model.RegistrationForm
import com.example.partytask.data.model.TokenWrap
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {
    @POST("registration")
    fun registration(@Body registrationForm: RegistrationForm) :Completable

    @POST("login")
    fun logIn(@Body logInForm: LogInForm):Single<TokenWrap>

}