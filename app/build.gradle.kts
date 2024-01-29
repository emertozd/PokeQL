plugins {
    alias(libs.plugins.convention.android.application)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.parcelize)
}

android {
    namespace = "com.emertozd.pokeql"

    defaultConfig {
        applicationId = "com.emertozd.pokeql"
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
        buildConfig = true
        compose = true
    }
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.features.home.ui)
    implementation(projects.features.home.data)
    implementation(projects.features.detail.implWiring)

    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)

    implementation(libs.composeDestinations)
    ksp(libs.composeDestinationsKsp)

    kspAndroidTest(libs.hilt.android.compiler)
}