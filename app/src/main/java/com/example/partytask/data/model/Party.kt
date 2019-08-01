package com.example.partytask.data.model
import com.google.gson.annotations.SerializedName

class Party(
    var id:Int =0,
    var name: String = "No name",
    var date: Long = 0L,
    var currentBalance: Int = 0,
    @SerializedName ("balance") //Аннотация SerializedName помогает нам соотнести наименование в Json на сервере и в нащем объекте
    var fullBalance: Int = 0,
    var image: String = "",
    var countNewEvent: Int = 0,
    var invitedMe: Boolean = false
)