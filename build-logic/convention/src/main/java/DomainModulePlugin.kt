import com.emertozd.pokeql.convention.extensions.configureKotlinJvm
import com.emertozd.pokeql.convention.extensions.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class DomainModulePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.jvm")
            }
            configureKotlinJvm()

            dependencies{
                "api"(project(":core:domain"))
                "implementation"(project(":core:schema"))
            }
        }
    }
}
