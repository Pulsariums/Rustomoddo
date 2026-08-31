plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    // Architectury API for common code across loaders
    compileOnly("dev.architectury:architectury:11.0.0")
}
