package com.example.melon.service

import com.google.gson.annotations.SerializedName

data class MusicEntity(
    @SerializedName("track") val track: String,
    @SerializedName("streamUrl") val StreamUrl :String,
    @SerializedName("artist") val artist : String,
    @SerializedName("coverUrl") val coverUrl : String
)