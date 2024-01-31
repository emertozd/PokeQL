plugins {
    alias(libs.plugins.module.data)
}

android {
    namespace = "com.emertozd.pokeql.detail.data"
}

dependencies {
    implementation(projects.features.detail.impl.domain)
}