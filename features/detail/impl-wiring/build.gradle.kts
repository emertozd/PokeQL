plugins {
    alias(libs.plugins.pokeql.android.library)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.emertozd.pokeql.detail.implwiring"
}

dependencies {
    implementation(projects.features.detail.impl.data)
    implementation(projects.features.detail.impl.domain)
    implementation(projects.features.detail.impl.ui)
    implementation(projects.features.detail.shared)

    ksp(libs.hilt.compiler)
    implementation(libs.hilt.android)
}