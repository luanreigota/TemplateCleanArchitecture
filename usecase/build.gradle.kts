

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":input-boundary"))
    implementation(project(":output-boundary"))
    implementation(project(":entities"))
    implementation(project(":configuration"))

}