plugins {
    alias(libs.plugins.module.fake)
}

android {
    namespace = "com.emertozd.pokeql.home.fake"
}

dependencies {
    api(projects.features.home.impl.domain)
    implementation(projects.features.detail.shared)
}