package com.vitoksmile.sample.mpp.compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform