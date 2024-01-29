plugins {
    alias(libs.plugins.convention.android.library)
    alias(libs.plugins.ksp)
}

val baseUrl = project.properties["BASE_URL"].toString()

android {
    namespace = "com.emertozd.pokeql.core.network"

    defaultConfig {
        buildConfigField(
            "String",
            "BASE_URL",
            baseUrl
        )
    }
    buildFeatures {
        buildConfig = true
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/graphql")
        }
    }
}

dependencies {
    api(projects.core.di)
    api(projects.core.schema)

    api(libs.logging.interceptor)
    api(libs.chucker)
    api(libs.apollo.runtime)
    api(libs.apollo.coroutines)

    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.android)
}