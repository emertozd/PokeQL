import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.emertozd.pokeql.convention.extensions.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "pokeql.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidLibrary") {
            id = "pokeql.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidComposeLibrary") {
            id = "pokeql.android.compose.library"
            implementationClass = "AndroidComposeLibraryConventionPlugin"
        }

        register("uiModule") {
            id = "module.ui"
            implementationClass = "UiModulePlugin"
        }

        register("domainModule") {
            id = "module.domain"
            implementationClass = "DomainModulePlugin"
        }

        register("dataModule") {
            id = "module.data"
            implementationClass = "DataModulePlugin"
        }

        register("fakeModule") {
            id = "module.fake"
            implementationClass = "FakeModulePlugin"
        }
        register("wiringModule") {
            id = "module.wiring"
            implementationClass = "WiringModulePlugin"
        }
        register("demoModule") {
            id = "module.demo"
            implementationClass = "DemoModulePlugin"
        }

        register("jvmLibrary") {
            id = "pokeql.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }

    }
}
