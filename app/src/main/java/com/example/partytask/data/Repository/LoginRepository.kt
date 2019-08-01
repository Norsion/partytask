package com.example.partytask.data.Repository

import com.example.partytask.data.model.LogInForm
import com.example.partytask.data.model.RegistrationForm
import com.example.partytask.data.model.TokenWrap
import com.example.partytask.data.network.ApiClient
import io.reactivex.Completable
import io.reactivex.Single

class LoginRepository() : ILoginRepository {
    private object Holder {
        val instance = LoginRepository()
    }

    companion object {
        val instance: LoginRepository by lazy { Holder.instance }
    }

    val authApiService = ApiClient.instance.authApiService

    override fun registration(name: String, phone: String): Completable {

        return authApiService.registration(RegistrationForm(phone, name))
    }

    override fun login(phone: String): Completable {
        return authApiService.registration(RegistrationForm(phone))
    }

    override fun checkCode(phone: String, code: String): Single<TokenWrap> {
        return authApiService.logIn(LogInForm(phone, code))
    }
}