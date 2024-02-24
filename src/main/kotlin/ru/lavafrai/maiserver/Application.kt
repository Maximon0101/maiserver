package ru.lavafrai.maiserver

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.lavafrai.maiserver.plugins.*

fun main() {
    embeddedServer(
        Netty,
        port = 80,
        host = "0.0.0.0",
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureSockets()
    configureRouting()
}