plugins {
    alias(libs.plugins.module.domain)
}

dependencies {
    api(projects.core.domain)
    api(libs.paging.common)
    api(projects.features.home.shared)
}