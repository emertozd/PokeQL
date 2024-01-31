plugins {
    alias(libs.plugins.module.wiring)
}

android {
    namespace = "com.emertozd.pokeql.home.fakewiring"
}

dependencies {
    api(projects.features.home.fake)
    api(projects.features.home.impl.ui)
}