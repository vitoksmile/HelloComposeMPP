plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

dependencies {
    implementation(project(":shared"))
}

compose.desktop {
    application {
        mainClass = "com.vitoksmile.sample.mpp.compose.MainKt"
    }
}