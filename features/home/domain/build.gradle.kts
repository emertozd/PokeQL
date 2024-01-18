plugins {
    alias(libs.plugins.pokeql.jvm.library)
}

dependencies {
    api(projects.core.domain)
    api(libs.paging.common)
}