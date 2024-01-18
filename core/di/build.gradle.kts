plugins {
    alias(libs.plugins.pokeql.jvm.library)
    alias(libs.plugins.ksp)
}

dependencies {
    api(libs.javax.inject)
    api(libs.hilt.core)
    ksp(libs.hilt.compiler)
    api(libs.kotlinx.coroutines.core)
}