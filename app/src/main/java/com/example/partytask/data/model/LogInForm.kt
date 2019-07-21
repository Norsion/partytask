package com.example.partytask.data.model

class LogInForm(
    val phone: String,
    val password: String,
    val platform: String = "Android",
    val version: String = "0.1"
) {}