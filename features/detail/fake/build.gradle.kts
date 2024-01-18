plugins {
    alias(libs.plugins.pokeql.android.library)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.emertozd.pokeql.detail.fake"
}

dependencies {
    api(projects.core.network)
    api(projects.features.detail.impl.domain)

    ksp(libs.hilt.compiler)
}