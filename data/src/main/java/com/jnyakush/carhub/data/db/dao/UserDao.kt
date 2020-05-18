package com.jnyakush.carhub.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jnyakush.carhub.data.db.Constants.CURRENT_USER_ID
import com.jnyakush.carhub.data.db.entity.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(user: User): Long

    @Query("SELECT * FROM User WHERE uid= $CURRENT_USER_ID")
    fun getUser(): LiveData<User>
}