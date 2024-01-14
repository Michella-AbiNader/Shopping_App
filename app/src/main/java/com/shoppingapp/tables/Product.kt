package com.shoppingapp.tables

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val price: Float,
    val category: String,
    val description: String,
    val shopId: Int
)