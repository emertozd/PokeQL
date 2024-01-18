plugins {
    alias(libs.plugins.pokeql.android.library)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.parcelize)
}

android {
    namespace = "com.emertozd.pokeql.home.ui"

    buildFeatures{
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinCompilerExtensionVersion.get()
    }

}

ksp {
    arg("compose-destinations.mode", "navgraphs")
    arg("compose-destinations.moduleName", "home")
    arg("compose-destinations.useComposableVisibility", "true")
}


dependencies {
    implementation(projects.core.ui)
    implementation(projects.features.home.domain)
    implementation(projects.features.detail.shared)
    implementation(libs.androidx.palette.ktx)

    testImplementation(projects.core.test)
    testImplementation(libs.paging.common)
    implementation(libs.paging.runtime)
    implementation(libs.paging.compose)

    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.android)

    implementation(libs.composeDestinations)
    ksp (libs.composeDestinationsKsp)

    implementation(libs.hilt.navigation.compose)

}