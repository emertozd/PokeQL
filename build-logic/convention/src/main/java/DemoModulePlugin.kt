import com.android.build.api.dsl.ApplicationExtension
import com.emertozd.pokeql.convention.extensions.configureKotlinAndroid
import com.emertozd.pokeql.convention.extensions.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class DemoModulePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("com.google.devtools.ksp")
                apply("com.google.dagger.hilt.android")
                apply("org.jetbrains.kotlin.plugin.parcelize")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                defaultConfig.apply {
                    targetSdk = 34
                }

                buildFeatures.apply {
                    compose = true
                }

                composeOptions {
                    kotlinCompilerExtensionVersion = libs.findVersion("kotlinCompilerExtensionVersion").get().toString()
                }
                dependencies {
                    "ksp"(libs.findLibrary("hilt-android-compiler").get())
                    "implementation"(libs.findLibrary("hilt-android").get())
                    "implementation"(libs.findLibrary("composeDestinations").get())
                    "ksp"(libs.findLibrary("composeDestinationsKsp").get())
                }
            }
        }
    }

}