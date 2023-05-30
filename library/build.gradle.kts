plugins {
    kotlin("js")
    `maven-publish`
}

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser()

        dependencies {
            implementation(npm("js-cookie", "3.0.5"))
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = rootProject.group.toString()
            version = rootProject.version.toString()
            artifactId = rootProject.name
            from(components["kotlin"])
        }
    }
}
