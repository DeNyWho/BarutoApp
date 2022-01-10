package com.example.barutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.barutoapp.util.Constants.HERE_REMOTE_KEY_DATABASE_TABLE

@Entity(tableName = HERE_REMOTE_KEY_DATABASE_TABLE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)