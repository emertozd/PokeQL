plugins {
    alias(libs.plugins.convention.jvm.library)
    alias(libs.plugins.apollo)
}

val baseUrl = project.properties["BASE_URL"].toString()


apollo {
    service("apollo") {
        packageName.set("com.emertozd.pokeql")
        generateApolloMetadata.set(true)
        introspection {
            endpointUrl.set(baseUrl.removeSurrounding("\""))
            schemaFile.set(file("src/main/graphql/schema.graphqls"))
        }
    }
}

dependencies {
    api(libs.apollo.runtime)
}