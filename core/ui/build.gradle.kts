plugins {
    id("pokeql.android.library")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.core.ui"

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinCompilerExtensionVersion.get()
    }


    buildFeatures {
        compose = true
    }
}

dependencies {
    api(project(":core:domain"))

    api(libs.core.ktx)
    api(libs.appcompat)
    api(libs.material)

    implementation(libs.lottie)


    api(libs.composeUI)
    api(libs.composeMaterial)
    api(libs.composeDestinations)
    ksp(libs.composeDestinationsKsp)
    api(libs.constraintlayoutCompose)
    api(libs.lifecycleRuntime)
    api(libs.androidx.ui.tooling)

    api(libs.coil)
    api(libs.coilSvg)

    api(libs.androidx.navigation.fragment.ktx)
    api(libs.androidx.navigation.ui.ktx)

    implementation(libs.hilt.core)
    ksp(libs.hilt.compiler)
}