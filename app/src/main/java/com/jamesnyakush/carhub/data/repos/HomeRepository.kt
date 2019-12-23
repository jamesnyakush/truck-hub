package com.jamesnyakush.carhub.data.repos

import com.jamesnyakush.carhub.data.db.AppDatabase
import com.jamesnyakush.carhub.data.db.entity.Home
import com.jamesnyakush.carhub.data.network.SafeApiRequest


class HomeRepository(
    private val db: AppDatabase
) : SafeApiRequest() {

    fun list() = listOf(
        Home("Masti", "1222", "Scania"),
        Home("Masti", "1222", "Scania"),
        Home("Masti", "1222", "Scania"),
        Home("Masti", "1222", "Scania"),
        Home("Masti", "1222", "Scania"),
        Home("Masti", "1222", "Scania"),
        Home("Masti", "1222", "Scania"),
        Home("Masti", "1222", "Scania")
    )
    //
}