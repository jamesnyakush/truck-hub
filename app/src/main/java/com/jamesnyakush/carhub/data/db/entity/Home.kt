package com.jamesnyakush.carhub.data.db.entity

import androidx.room.Entity

@Entity
data class Home(
    var name: String? = null,
    var reg: String? = null,
    var manufacturer: String? = null
)