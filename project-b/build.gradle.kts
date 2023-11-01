plugins {
    kotlin("jvm") version "1.9.20"
    id("kotlin-conventions")
}

kotlin {
    jvmToolchain(20)
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
