package com.example.melon

data class PlayerModel(
    private val playMuisicList : List<MusicModel> = emptyList(),
    var currentPosition: Int = -1,
    var isWatchingPlayListView : Boolean = true
) {

    fun getAdapterModels() : List<MusicModel> {
        return playMuisicList.mapIndexed{ index, musicModel ->

            val newItem = musicModel.copy(
                isPlaying = index == currentPosition
            )
            newItem
        }
    }

    fun updateCurrentPosition(musicModel: MusicModel) {
        currentPosition = playMuisicList.indexOf(musicModel)
    }
    fun nextMusic() : MusicModel? {
        if (playMuisicList.isEmpty()) return null
        currentPosition = if ((currentPosition+1) == playMuisicList.size) 0 else currentPosition +1
        return playMuisicList[currentPosition]
    }
    fun prevMusic() : MusicModel? {
        if (playMuisicList.isEmpty()) return null
        currentPosition = if ((currentPosition-1)< 0) playMuisicList.lastIndex else currentPosition-1
        return playMuisicList[currentPosition]
    }

    fun currentMusicModel(): MusicModel? {
        if (playMuisicList.isEmpty()) return null
        return playMuisicList[currentPosition]
    }

}