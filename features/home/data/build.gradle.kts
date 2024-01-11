plugins {
    id("pokeql.android.library")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.emertozd.pokeql.home.data"
}

dependencies {
    implementation(project(":core:network"))
    implementation(project(":features:home:domain"))
    api(libs.paging.runtime)

    ksp(libs.hilt.compiler)
}