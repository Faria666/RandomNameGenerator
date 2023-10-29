package com.example.randomnamegenerator.generator.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class Name(
    val name: String,
    val gender: String,
    var count: Int ,
): Parcelable