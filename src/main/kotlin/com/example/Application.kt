package com.example

import com.example.plugins.*
import com.example.routes.doctorRoute
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = {
        configureSerialization()
        configureMonitoring()
        doctorRoute()
    })
        .start(wait = true)
}

