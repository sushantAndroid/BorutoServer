package org.movieverse.routes

import io.ktor.server.response.respond
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import org.movieverse.modules.ApiResponse
import org.movieverse.repository.HeroRepository

fun Route.getAllHeroes() {
    val heroRepository : HeroRepository by inject()
    get("/boruto/heroes") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            println("new page : $page")
            require(page in 1..5)
            val apiResponse = heroRepository.getAllHeroes(page)
            call.respond(apiResponse)
        } catch (e: NumberFormatException) {
            call.respond(ApiResponse(success = false, message = "Only Numbers are allowed"))
        } catch (e: IllegalArgumentException) {
            call.respond(ApiResponse(false,"Heroes not Found"))
        }
    }
}