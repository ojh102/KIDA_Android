// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dep.Plugins.androidGradlePlugin)
        classpath(Dep.Plugins.kotlin)
        classpath(Dep.Plugins.dagger)
        classpath(Dep.Plugins.spotless)
    }
}

subprojects {

    afterEvaluate {
        project.apply("$rootDir/spotless.gradle")
        // used ./gradlew spotlessCheck
        // used ./gradlew spotlessApply
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}