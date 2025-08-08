package com.mrx.inventory.models

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val name: String,
    val quantity: Int,
    val unit: String,
)