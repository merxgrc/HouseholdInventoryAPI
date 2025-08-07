package com.mrx.inventory.models

import kotlinx.serialization.Serializable

@Serializable
data class HealthStatus(
    val message: String,
)