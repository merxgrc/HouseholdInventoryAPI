package com.mrx.inventory

import com.mrx.inventory.models.HealthStatus
import com.mrx.inventory.models.Item
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.receive
import io.ktor.server.response.*
import io.ktor.server.routing.*

val inventory = mutableListOf<Item>()

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respond(HealthStatus("Household Inventory API is running"))
        }
        post("/items") {
            val item = call.receive<Item>()
            inventory.add(item)
            call.respond(HttpStatusCode.Created, item)
        }
    }
}
