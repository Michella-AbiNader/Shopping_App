package com.shoppingapp.tables

import android.media.Image
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Shop (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val category: String,
    val pass: String,
    val themeColor : String,
    val logo: Image
)