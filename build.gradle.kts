import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.7.10"
	application
}

group = "org.foldl"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	//doyaaaaaken's kotlin-csv
	implementation("com.github.doyaaaaaken:kotlin-csv-jvm:1.5.1")
	//kotlin-grass
	implementation("io.github.blackmo18:kotlin-grass-core-jvm:1.0.0")
	implementation("io.github.blackmo18:kotlin-grass-parser-jvm:0.8.0")

	testImplementation(kotlin("test"))
}

tasks.test {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}

application {
	mainClass.set("MainKt")
}