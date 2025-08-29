plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"
val mockkVersion = "1.14.5"
val junitVersion = "5.13.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-params:${junitVersion}")
    testImplementation("io.mockk:mockk:${mockkVersion}")
    testImplementation("io.mockk:mockk-bdd:${mockkVersion}")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}