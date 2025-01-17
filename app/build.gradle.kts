plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.tp2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tp2"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }


}

dependencies {
    // Core dependencies
    implementation("androidx.appcompat:appcompat:1.6.1") // Version mise à jour
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.preference:preference:1.2.1")
    implementation("androidx.activity:activity:1.7.2")
    implementation("androidx.work:work-runtime:2.8.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    // Testing dependencies
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Support for local JAR files (if needed)
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
}
