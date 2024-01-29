plugins {
    alias(libs.plugins.convention.jvm.library)
}

dependencies {
    api(libs.kotlinx.coroutines.core)
    api(libs.javax.inject)
}