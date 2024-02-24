package ru.lavafrai.maiserver.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import ru.lavafrai.maiserver.routes.groups

fun Application.configureRouting() {
    routing {
        groups()
    }
}