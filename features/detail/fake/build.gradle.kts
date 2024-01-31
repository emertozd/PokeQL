plugins {
    alias(libs.plugins.module.fake)
}

android {
    namespace = "com.emertozd.pokeql.detail.fake"
}

dependencies {
    api(projects.features.detail.impl.domain)
}