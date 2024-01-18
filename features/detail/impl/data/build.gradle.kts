plugins {
    alias(libs.plugins.pokeql.android.library)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.emertozd.pokeql.detail.data"
}

dependencies {
    implementation(projects.core.network)
    implementation(projects.features.detail.impl.domain)

    ksp(libs.hilt.compiler)
}