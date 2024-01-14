package com.shoppingapp.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val username: String,
    val pass: String
)
