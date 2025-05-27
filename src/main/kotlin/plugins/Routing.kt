package org.movieverse.plugins

import io.ktor.server.application.Application
import io.ktor.server.routing.routing
import org.movieverse.routes.root

fun Application.routing(){
    routing {
        root()
    }
}