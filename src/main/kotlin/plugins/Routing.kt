package org.movieverse.plugins

import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.routing(){
    routing {
        get("/") {
            call.respondText { "Hello, Sushant....this is EngineMain Server !!" }
        }
    }
}