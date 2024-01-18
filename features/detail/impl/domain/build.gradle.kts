plugins {
    alias(libs.plugins.pokeql.jvm.library)
}

dependencies {
    api(projects.core.domain)
    implementation(projects.core.schema)
    api(projects.features.detail.shared)
}