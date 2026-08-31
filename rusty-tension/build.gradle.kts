plugins {
    // Apply the common Java plugin
    java
    // Apply the common Rust plugin for the root project
    id("me.champeau.jgitresolver") version "0.0.7" apply false
    id("net.neoforged.gradle.userdev") version "7.0.152" apply false
    id("fabric-loom") version "1.7-SNAPSHOT" apply false
    id("org.jetbrains.kotlin.jvm") version "2.0.0" apply false
}

allprojects {
    group = "dev.rustytension"
    version = "1.0.0-alpha.1"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(21))
        }
        withSourcesJar()
        withJavadocJar()
    }

    kotlin {
        jvmToolchain(21)
    }

    repositories {
        mavenCentral()
        maven { url "https://maven.fabricmc.net/" }
        maven { url "https://maven.neoforged.net/releases/" }
        maven { url "https://maven.minecraft.net/" }
        maven { url "https://jitpack.io" }
    }
}

tasks.named<Wrapper>("wrapper") {
    distributionType = Wrapper.DistributionType.ALL
}
