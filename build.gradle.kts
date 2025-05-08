plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("org.jetbrains.dokka") version "1.9.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("MainKt")
}

tasks.dokkaHtml {
    outputDirectory.set(file("build/dokka"))
}