plugins {
    id("com.micronauttodo.build.internal.lib-module")
}
dependencies {
    implementation("io.micronaut.security:micronaut-security-oauth2")
    implementation("io.micronaut.security:micronaut-security-jwt")
}