

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":configuration"))
    implementation(project(":input-boundary"))
    implementation(project(":output-boundary"))
    implementation(project(":usecase"))
    implementation(project(":entities"))
    implementation(project(":web"))
    implementation(project(":repository"))
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    mainClass.set("com.template_clean_architecture.BootApplication.kt")
}