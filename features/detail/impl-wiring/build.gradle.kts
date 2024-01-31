plugins {
    alias(libs.plugins.module.wiring)
}

android {
    namespace = "com.emertozd.pokeql.detail.implwiring"
}

dependencies {
    implementation(projects.features.detail.impl.data)
    implementation(projects.features.detail.impl.domain)
    api(projects.features.detail.impl.ui)
}