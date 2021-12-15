package com.example.melon

import com.example.melon.service.MusicDTO
import com.example.melon.service.MusicEntity

fun MusicEntity.mapper(id: Long) : MusicModel =
    MusicModel(
        id = id,
        streamUrl = StreamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )

fun MusicDTO.mapper() : PlayerModel =
    PlayerModel(
        playMuisicList = musics.mapIndexed { index, musicEntity ->
                musicEntity.mapper(index.toLong())
            }
    )