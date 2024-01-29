plugins {
    alias(libs.plugins.module.demo)
}

android {
    namespace = "com.emertozd.pokeql.features.detail.demo.detail"

    defaultConfig {
        applicationId = "com.emertozd.pokeql.features.detail.demo.detail"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.features.detail.fakeWiring)
}