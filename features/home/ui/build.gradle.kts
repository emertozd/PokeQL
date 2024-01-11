plugins {
    id("pokeql.android.library")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("kotlin-parcelize")
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
    implementation(project(":core:ui"))
    implementation(project(":features:home:domain"))
    implementation(project(":features:detail:shared"))
    implementation(libs.androidx.palette.ktx)

    testImplementation(project(":core:test"))
    testImplementation(libs.paging.common)
    implementation(libs.paging.runtime)
    implementation(libs.paging.compose)

    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.android)

    implementation(libs.composeDestinations)
    ksp (libs.composeDestinationsKsp)

    implementation(libs.hilt.navigation.compose)

}