plugins {
    alias(libs.plugins.pokeql.android.library)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.emertozd.pokeql.detail.fakewiring"
}

dependencies {
    api(projects.features.detail.fake)
    api(projects.features.detail.impl.ui)
    implementation(projects.features.detail.shared)
    implementation(projects.features.detail.impl.domain)

    ksp(libs.hilt.compiler)
    implementation(libs.hilt.android)
}