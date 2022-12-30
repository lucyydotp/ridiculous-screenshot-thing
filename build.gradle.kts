plugins {
    id("fabric-loom") version "1.0-SNAPSHOT"
}

version = "1.0-SNAPSHOT"
group = "net.lucypoulton"


dependencies {
    minecraft("com.mojang:minecraft:1.19.3")
    mappings ("net.fabricmc:yarn:1.19.3+build.5:v2")
    modImplementation ("net.fabricmc:fabric-loader:0.14.12")

    modImplementation ("net.fabricmc.fabric-api:fabric-api:0.70.0+1.19.3")
}

tasks {
    processResources {
        inputs.property("version", project.version)
        filteringCharset= "UTF-8"

        filesMatching("fabric.mod.json") {
            expand(mapOf("version" to project.version))
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}
