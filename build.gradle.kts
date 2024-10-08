// Top-level build file where you can add configuration options common to all sub-projects/modules.
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.5.0")
        classpath ("com.google.gms:google-services:4.4.2")
    }
}

plugins {
    id ("com.android.application") version "8.5.0" apply false
    id ("com.android.library") version "8.5.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.8.0" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}