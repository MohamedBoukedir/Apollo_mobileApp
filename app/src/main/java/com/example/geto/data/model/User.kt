package com.example.geto.data.model

import android.os.Parcelable
import android.provider.ContactsContract
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class User(
    val name:String,
    val password:String,
    val id:Int,
    val projects :List<Project>,
    val email:String
) :Parcelable
