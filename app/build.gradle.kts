plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.zhackathon"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.zhackathon"
        minSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("com.github.denzcoskun:ImageSlideshow:0.1.2")

    implementation("com.amazonaws:aws-android-sdk-iot:2.22.0")
    implementation("com.amazonaws:aws-android-sdk-core:2.22.0")
}