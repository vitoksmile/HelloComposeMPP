package com.vitoksmile.sample.mpp.compose

class JVMPlatform : Platform {
    override val name: String = "JVM ${System.getProperty("os.name")}"
}

actual fun getPlatform(): Platform = JVMPlatform()