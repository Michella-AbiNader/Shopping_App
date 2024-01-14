package com.shoppingapp.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Basket (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val userId: Int,
    val itemId: Int,
    val shopId: Int,
    val numberOfItems: Int
)