package com.example.pertemuan1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform