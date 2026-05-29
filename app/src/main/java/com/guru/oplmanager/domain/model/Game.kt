package com.guru.oplmanager.domain.model

data class Game(
    val id: Int = 0,
    val title: String,
    val size: Long,
    val coverPath: String = "",
    val category: String = "",
    val dateAdded: Long = System.currentTimeMillis(),
    val description: String = "",
    val isFavorite: Boolean = false
)
