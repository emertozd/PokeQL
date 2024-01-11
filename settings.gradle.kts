@file:Suppress("UnstableApiUsage")

include(":app")

include(":core:di")
include(":core:network")
include(":core:domain")
include(":core:ui")
include(":core:test")

include(":features:home:ui")
include(":features:home:data")
include(":features:home:domain")

include(":features:detail:shared")
include(":features:detail:ui")
include(":features:detail:data")
include(":features:detail:domain")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PokeQL"


