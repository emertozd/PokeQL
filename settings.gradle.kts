@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")

include(":core:di")
include(":core:network")
include(":core:schema")
include(":core:domain")
include(":core:ui")
include(":core:test")

include(":features:home:ui")
include(":features:home:data")
include(":features:home:domain")

include(":features:detail:shared")
include(":features:detail:impl:ui")
include(":features:detail:impl:data")
include(":features:detail:impl:domain")
include(":features:detail:impl-wiring")
include(":features:detail:fake")
include(":features:detail:fake-wiring")
include(":features:detail:demo")

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


