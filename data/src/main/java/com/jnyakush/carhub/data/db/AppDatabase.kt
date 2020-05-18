package com.jnyakush.carhub.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jnyakush.carhub.data.db.dao.TruckDao
import com.jnyakush.carhub.data.db.dao.UserDao
import com.jnyakush.carhub.data.db.entity.Truck
import com.jnyakush.carhub.data.db.entity.User


@Database(
    entities = [
        User::class,
        Truck::class
    ],
    version = 1,
    exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun getUserDao(): UserDao
    abstract fun getTruckDao(): TruckDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "truckdata"
        ).build()
    }
}