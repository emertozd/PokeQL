plugins {
    alias(libs.plugins.module.data)
}

android {
    namespace = "com.emertozd.pokeql.home.data"
}

dependencies {
    implementation(projects.features.home.impl.domain)
    api(libs.paging.runtime)
}