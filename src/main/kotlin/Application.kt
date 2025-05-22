package org.movieverse

import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun main(args : Array<String>) : Unit = io.ktor.server.netty.EngineMain.main(args)
@Suppress("unused")
fun Application.module(){
    routing {
        get("/") {
            call.respondText { "Hello, Sushant....this is EngineMain Server !!" }
        }
    }
}



/*
command for set java home
$env:JAVA_HOME  ="C:\Program Files\Java\jdk-17"*/
