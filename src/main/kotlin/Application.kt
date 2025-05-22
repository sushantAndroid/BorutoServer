package org.movieverse

import io.ktor.server.application.Application
import org.movieverse.plugins.configureDefaultHeader
import org.movieverse.plugins.configureKoin
import org.movieverse.plugins.configureMonitoring
import org.movieverse.plugins.routing
import org.movieverse.plugins.serialization

fun main(args : Array<String>) : Unit = io.ktor.server.netty.EngineMain.main(args)
@Suppress("unused")
fun Application.module(){
    configureKoin()
    configureMonitoring()
    configureDefaultHeader()
    routing()
    serialization()
}



/*
command for set java home
$env:JAVA_HOME  ="C:\Program Files\Java\jdk-17"
*/
