plugins {
    alias(libs.plugins.module.domain)
}

dependencies {
    api(projects.features.detail.shared)
}