plugins {
    val kotlinVersion = "1.7.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.14.0"
}

group = "io.github.gdpl2112"
version = "1.0"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}

dependencies {
    implementation("io.github.Kloping:spt-web:0.2.0") {
        exclude(group = "io.github.Kloping", module = "SpringTool")
        exclude(group ="io.github.Kloping", module = "JvUtils")
        exclude(group ="com.alibaba", module = "fastjson")
        exclude(group ="org.jsoup", module = "jsoup")
    }
}