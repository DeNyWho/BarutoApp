package com.example.barutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.barutoapp.data.local.dao.HeroDao
import com.example.barutoapp.data.local.dao.HeroRemoteKeyDao
import com.example.barutoapp.domain.model.Hero
import com.example.barutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase: RoomDatabase() {

    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}