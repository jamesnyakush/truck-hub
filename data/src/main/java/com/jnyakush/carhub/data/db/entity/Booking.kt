package com.jnyakush.carhub.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Booking(
    @PrimaryKey(autoGenerate = false)
    val id: Int?,
    val created_at: String?,
    val end_date: String?,
    val start_date: String?,
    val trucks_id: Int?,
    val updated_at: String?
)