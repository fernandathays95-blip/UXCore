plugins {
    kotlin("jvm") version "1.9.0"
    id("org.jetbrains.compose") version "1.6.0"
}

group = "com.arcanos"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)
}

kotlin {
    jvmToolchain(17)
}

compose.desktop {
    application {
        mainClass = "ui.MainKt"
        nativeDistributions {
            targetFormats(org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg,
                          org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi,
                          org.jetbrains.compose.desktop.application.dsl.TargetFormat.Deb)
            packageName = "UXCoreDesktop"
            packageVersion = "1.0.0"
        }
    }
}
