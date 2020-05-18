package com.jnyakush.carhub.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jnyakush.carhub.data.db.entity.Booking

@Dao
interface BookingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveBooking(booking: Booking)

    @Query("SELECT * FROM Booking")
    fun getBookings(): LiveData<List<Booking>>
}