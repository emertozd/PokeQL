plugins {
    alias(libs.plugins.module.wiring)
}

android {
    namespace = "com.emertozd.pokeql.home.implwiring"
}

dependencies {
    implementation(projects.features.home.impl.data)
    implementation(projects.features.home.impl.domain)
    api(projects.features.home.impl.ui)
}