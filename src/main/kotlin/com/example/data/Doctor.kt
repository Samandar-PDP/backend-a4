package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class Doctor(
    val id: Int,
    val fullName: String,
    val role: String,
    val number: String,
    val workingDays: String,
    val workingHours: String,
    val gender: Boolean,
    val age: Int,
    val image: String
)