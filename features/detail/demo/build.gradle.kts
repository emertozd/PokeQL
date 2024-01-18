plugins {
    alias(libs.plugins.pokeql.android.application)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.parcelize)
}

android {
    namespace = "com.emertozd.pokeql.features.detail.demo.detail"

    defaultConfig {
        applicationId = "com.emertozd.pokeql.features.detail.demo.detail"
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinCompilerExtensionVersion.get()
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.features.detail.fakeWiring)

    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)

    implementation(libs.composeDestinations)
    ksp(libs.composeDestinationsKsp)
}