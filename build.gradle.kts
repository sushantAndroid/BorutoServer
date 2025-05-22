plugins {
    application
    kotlin("jvm") version "2.1.20"
    kotlin("plugin.serialization") version "2.1.20"
}

group = "org.movieverse"
version = "1.0-SNAPSHOT"

application{
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("io.ktor:ktor-server-core:3.1.3")
    implementation("io.ktor:ktor-server-netty:3.1.3")
    implementation("io.ktor:ktor-server-status-pages:3.1.3")
    implementation("ch.qos.logback:logback-classic:1.5.13")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1")
    implementation("io.insert-koin:koin-ktor:4.0.3")
    implementation("io.insert-koin:koin-logger-slf4j:4.0.3")
    implementation("io.ktor:ktor-server-content-negotiation:3.1.3")
    implementation("io.ktor:ktor-serialization-kotlinx-json:3.1.3")
    implementation("io.ktor:ktor-server-call-logging:3.1.3")
    implementation("io.ktor:ktor-server-default-headers:3.1.3")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}