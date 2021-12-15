package com.example.melon.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("/v3/887521d6-858c-4b02-a447-8d63b1f87191")
    fun listMusics() : Call<MusicDTO>
}