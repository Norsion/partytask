package com.example.partytask.data.Repository

import com.example.partytask.data.model.TokenWrap
import io.reactivex.Completable
import io.reactivex.Single

interface ILoginRepository {
    fun registration(name:String, phone:String) : Completable
    fun login(phone: String): Completable
    fun checkCode(phone: String, code:String): Single<TokenWrap>
}