import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm")
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
  implementation("junit:junit:4.13.2")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "17"
  }
}

tasks.withType<Jar>().getByName("jar") {
  destinationDirectory.set(libJVMFolder)
}