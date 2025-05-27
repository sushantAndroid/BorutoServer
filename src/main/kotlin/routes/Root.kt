package org.movieverse.routes

import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.root(){
    get("/"){
        call.respond("Welcome to Boruto API")
    }
}