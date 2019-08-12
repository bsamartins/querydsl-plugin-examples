rootProject.name = "querydsl-examples"

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

include(":application")
include(":library")
include(":war")
include(":lombok")

