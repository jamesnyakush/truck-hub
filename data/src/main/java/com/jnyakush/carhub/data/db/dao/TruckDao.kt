package com.jnyakush.carhub.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jnyakush.carhub.data.db.entity.Truck

@Dao
interface TruckDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveTruck(truck: List<Truck>)

    @Query("SELECT * FROM  Truck")
    fun getTrucks(): LiveData<List<Truck>>
}