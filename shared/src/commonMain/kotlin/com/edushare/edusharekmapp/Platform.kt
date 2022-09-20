package com.edushare.edusharekmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform