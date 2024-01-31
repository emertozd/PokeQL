plugins {
    alias(libs.plugins.module.wiring)
}

android {
    namespace = "com.emertozd.pokeql.detail.fakewiring"
}

dependencies {
    api(projects.features.detail.fake)
    api(projects.features.detail.impl.ui)
}