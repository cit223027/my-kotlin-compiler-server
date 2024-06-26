rootProject.name = "kotlin-compiler-server"
include(":executors")
include(":indexation")
include(":common")
include(":dependencies")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap")
    }
}