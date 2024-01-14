package com.shoppingapp.tables.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.shoppingapp.tables.Product
import com.shoppingapp.tables.Shop

data class ShopWithProducts (
    @Embedded val shop: Shop,
    @Relation(
        parentColumn = "id",
        entityColumn = "shopId"
    )
    val products: List<Product>
)