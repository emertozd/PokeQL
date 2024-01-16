plugins {
    id("pokeql.android.library")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.emertozd.pokeql.detail.ui"

    defaultConfig {
//        buildConfigField(
//            "String",
//            "POLYGON_API_KEY",
//            project.properties["POLYGON_API_KEY"].toString()
//        )
    }
    buildFeatures {
        buildConfig = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinCompilerExtensionVersion.get()
    }
}

ksp {
    arg("compose-destinations.mode", "navgraphs")
    arg("compose-destinations.moduleName", "pokemonDetail")
    arg("compose-destinations.useComposableVisibility", "true")
}

dependencies {
    implementation(project(":core:ui"))
    implementation(project(":features:detail:domain"))
    implementation(project(":features:detail:shared"))
    implementation(libs.androidx.palette.ktx)

    testImplementation(project(":core:test"))

    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.android)

    implementation(libs.hilt.navigation.compose)
    implementation(libs.composeDestinations)
    ksp (libs.composeDestinationsKsp)
}