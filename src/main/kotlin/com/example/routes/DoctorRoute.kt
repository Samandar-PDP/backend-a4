package com.example.routes

import com.example.data.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.doctorRoute() {
    routing {
        static {
            resources("static")
        }

//        staticResources("/static","files")

        get("/") {
            call.respondText("Hello Kotlin!")
        }
        get("/doctors") {
            call.respond(
                HttpStatusCode.OK,
                DoctorList.doctorList
            )
        }
        get("/doctors/{id}") {
            val index = call.parameters["id"]?.toInt() ?: 0 // "1" -> 1
            call.respond(
                HttpStatusCode.OK,
                DoctorList.doctorList[index]
            )
        }
    }
}