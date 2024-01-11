plugins {
    id("pokeql.android.library")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.emertozd.pokeql.detail.data"
}

dependencies {
    implementation(project(":core:network"))
    implementation(project(":features:detail:domain"))

    ksp(libs.hilt.compiler)
}