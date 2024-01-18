plugins {
    alias(libs.plugins.pokeql.android.library)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.emertozd.pokeql.home.data"
}

dependencies {
    implementation(projects.core.network)
    implementation(projects.features.home.domain)
    api(libs.paging.runtime)

    ksp(libs.hilt.compiler)
}