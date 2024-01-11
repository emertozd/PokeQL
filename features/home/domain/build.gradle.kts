plugins {
    id("pokeql.jvm.library")
}

dependencies {
    api(project(":core:domain"))
    api(libs.paging.common)
}