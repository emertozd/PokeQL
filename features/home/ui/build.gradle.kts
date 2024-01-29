plugins {
    alias(libs.plugins.module.ui)
}

android {
    namespace = "com.emertozd.pokeql.home.ui"
}

dependencies {
    implementation(projects.features.home.domain)
    implementation(projects.features.detail.shared)
    implementation(libs.androidx.palette.ktx)

    implementation(libs.paging.runtime)
    implementation(libs.paging.compose)
}