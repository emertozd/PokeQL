plugins {
    id("pokeql.android.library")
    id("com.google.devtools.ksp")
    id(libs.plugins.apollo.get().pluginId)
}

val baseUrl = project.properties["BASE_URL"].toString()

android {
    namespace = "com.core.network"

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


apollo {
    service("apollo") {
        packageName.set("com.emertozd.pokeql")

        introspection {
            endpointUrl.set(baseUrl.removeSurrounding("\""))
            schemaFile.set(file("src/main/graphql/schema.graphqls"))
        }
    }
}

dependencies {
    api(project(":core:di"))

    api(libs.logging.interceptor)
    api(libs.chucker)
    api(libs.apollo.runtime)
    api(libs.apollo.coroutines)

    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.android)
}