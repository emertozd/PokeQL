import com.android.build.api.variant.LibraryAndroidComponentsExtension
import com.android.build.gradle.LibraryExtension
import com.emertozd.pokeql.convention.extensions.configureKotlinAndroid
import com.emertozd.pokeql.convention.extensions.configureKotlinAndroidToolchain
import com.emertozd.pokeql.convention.extensions.disableUnnecessaryAndroidTests
import com.emertozd.pokeql.convention.extensions.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class FakeModulePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
                apply("com.google.devtools.ksp")
            }

            configureKotlinAndroidToolchain()
            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 34
            }
            extensions.configure<LibraryAndroidComponentsExtension> {
                disableUnnecessaryAndroidTests(target)
            }

            dependencies {
                "implementation"(project(":core:network"))
                "ksp"(libs.findLibrary("hilt-android-compiler").get())
            }
        }
    }
}