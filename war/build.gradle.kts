import com.ewerk.gradle.plugins.querydsl.QuerydslPluginExtension

// TODO: Remove
buildscript {
  repositories {
    mavenLocal()
    mavenCentral()
  }

  dependencies {
    classpath("com.ewerk.gradle.plugins:querydsl-plugin:2.0.0-SNAPSHOT")
  }
}

plugins {
  war
  java
//  id("com.ewerk.gradle.plugins.querydsl") version "2.0.0-SNAPSHOT-bm"
}

// TODO: Remove
apply(plugin="com.ewerk.gradle.plugins.querydsl")

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.querydsl:querydsl-core:4.2.1")
  implementation("com.querydsl:querydsl-jpa:4.2.1")
//  implementation("javax.persistence:javax.persistence-api:2.2")
  providedCompile("javax.persistence:javax.persistence-api:2.2")

  // fix for: Unable to load class 'javax.annotation.Generated'.
  implementation("javax.annotation:javax.annotation-api:1.3.2")
}

//querydsl {
configure<QuerydslPluginExtension> {
  isJpa = true
}
//}
