package com.example.partytask

import android.app.Application
import android.content.Context

class App : Application() {
    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    var token: String?
    get() = getSharedPreferences("auth", Context.MODE_PRIVATE).getString("token", null)
    set(value) = getSharedPreferences("auth", Context.MODE_PRIVATE).edit().putString("token", value).apply()
}