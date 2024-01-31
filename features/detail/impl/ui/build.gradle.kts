plugins {
    alias(libs.plugins.module.ui)
}

android {
    namespace = "com.emertozd.pokeql.features.detail.ui"
}

dependencies {
    implementation(projects.features.detail.impl.domain)
    implementation(libs.androidx.palette.ktx)
}