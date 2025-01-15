rootProject.name = "edc-connector-repo"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
    }
}

include(":ApiExtension:StatusApiExtension")

include(":transfer:transfer-00-prerequisites:connector")

include(":transfer:transfer-04-event-consumer:consumer-with-listener")
include(":transfer:transfer-04-event-consumer:listener")

include(":transfer:transfer-05-file-transfer-cloud:cloud-transfer-consumer")
include(":transfer:transfer-05-file-transfer-cloud:cloud-transfer-provider")
include(":transfer:transfer-05-file-transfer-cloud:transfer-file-cloud")

//policy Extension
include(":policy:policyExtension:policy-enforcement-provider")
include(":policy:policyExtension:policy-enforcement-consumer")
include(":policy:policyExtension:policy-functions")

// modules for code samples ------------------------------------------------------------------------
include(":advanced:advanced-02-custom-runtime")

