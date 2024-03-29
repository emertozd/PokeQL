plugins {
    alias(libs.plugins.convention.jvm.library)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.test)
    implementation(libs.junit)

    testApi(libs.kotlinx.coroutines.core)
    testApi(libs.junit)
    testApi(libs.kotlinx.coroutines.test)
}