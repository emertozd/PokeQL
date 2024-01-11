plugins {
    id("pokeql.android.application")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("kotlin-parcelize")
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
    implementation(project(":core:ui"))
    implementation(project(":features:home:ui"))
    implementation(project(":features:home:data"))
    implementation(project(":features:detail:ui"))
    implementation(project(":features:detail:data"))

    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)

    implementation(libs.composeDestinations)
    ksp (libs.composeDestinationsKsp)

    kspAndroidTest(libs.hilt.android.compiler)
}