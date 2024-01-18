plugins {
    alias(libs.plugins.pokeql.android.library)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.parcelize)
}

android {
    namespace = "com.emertozd.pokeql.features.detail.ui"

    buildFeatures {
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
    implementation(projects.core.ui)
    implementation(projects.features.detail.impl.domain)
    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.android)
    implementation(libs.androidx.palette.ktx)
    implementation(libs.hilt.navigation.compose)
    implementation(libs.composeDestinations)
    ksp (libs.composeDestinationsKsp)

    testImplementation(projects.core.test)
}