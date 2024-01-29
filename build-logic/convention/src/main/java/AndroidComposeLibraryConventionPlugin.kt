import com.android.build.api.variant.LibraryAndroidComponentsExtension
import com.android.build.gradle.LibraryExtension
import com.emertozd.pokeql.convention.extensions.configureKotlinAndroid
import com.emertozd.pokeql.convention.extensions.configureKotlinAndroidToolchain
import com.emertozd.pokeql.convention.extensions.disableUnnecessaryAndroidTests
import com.emertozd.pokeql.convention.extensions.libs
import com.google.devtools.ksp.gradle.KspExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidComposeLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
                apply("com.google.devtools.ksp")
                apply("com.google.dagger.hilt.android")
                apply("org.jetbrains.kotlin.plugin.parcelize")
            }

            configureKotlinAndroidToolchain()
            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 34

                composeOptions {
                    kotlinCompilerExtensionVersion = libs.findVersion("kotlinCompilerExtensionVersion").get().toString()
                }

                buildFeatures.apply {
                    compose = true
                }
            }
            extensions.configure<KspExtension> {
                val moduleName = if(target.parent?.name == "impl") {
                    target.parent?.parent?.name
                } else {
                    target.parent?.name
                }
                arg("compose-destinations.mode", "navgraphs")
                moduleName?.let {
                    arg("compose-destinations.moduleName", it)
                }
                arg("compose-destinations.useComposableVisibility", "true")
            }
            extensions.configure<LibraryAndroidComponentsExtension> {
                disableUnnecessaryAndroidTests(target)
            }
        }
    }
}