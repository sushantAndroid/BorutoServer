package org.movieverse.plugins

import io.ktor.server.application.Application
import io.ktor.server.http.content.resource
import io.ktor.server.http.content.resources
import io.ktor.server.http.content.static
import io.ktor.server.routing.routing
import org.movieverse.routes.getAllHeroes
import org.movieverse.routes.root
import org.movieverse.routes.searchHeroes

fun Application.routing(){
    routing {
        root()
        getAllHeroes()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}