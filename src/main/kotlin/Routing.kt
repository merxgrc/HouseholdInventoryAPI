package com.mrx.inventory

import com.mrx.inventory.models.HealthStatus
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respond(HealthStatus("Household Inventory API is running"))
        }
    }
}
