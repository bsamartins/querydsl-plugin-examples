import com.ewerk.gradle.plugins.querydsl.QuerydslPluginExtension

plugins {
  java
  id("com.ewerk.gradle.plugins.querydsl") version "2.0.0-SNAPSHOT"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.querydsl:querydsl-core:4.2.1")
  implementation("com.querydsl:querydsl-jpa:4.2.1")
  implementation("javax.persistence:javax.persistence-api:2.2")

  // fix for: Unable to load class 'javax.annotation.Generated'.
  implementation("javax.annotation:javax.annotation-api:1.3.2")

//  compile("com.querydsl:querydsl-apt:4.2.1")
//  annotationProcessor("com.querydsl:querydsl-apt:4.2.1")
}

querydsl {
  isJpa = true
}
//}

project.configurations.named("annotationProcessor") {
  val compileOnly by project.configurations
  extendsFrom(compileOnly)
}