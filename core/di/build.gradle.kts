plugins {
    id("pokeql.jvm.library")
    id("com.google.devtools.ksp")
}

dependencies {
    api(libs.javax.inject)
    api(libs.hilt.core)
    ksp(libs.hilt.compiler)
    api(libs.kotlinx.coroutines.core)
}