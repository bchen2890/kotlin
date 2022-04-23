import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    application
}

group = "bchen.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
    filter {
        //include all tests from package
        includeTestsMatching("*Test*")
    }
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}