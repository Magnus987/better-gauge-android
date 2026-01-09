plugins {
    id("com.android.library")
}

android {
    namespace = "com.ekn.gruzer.gaugelibrary"
    compileSdk = 34

    defaultConfig {
        minSdk = 35
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
}

dependencies {
    implementation("com.google.android.material:material:1.11.0")
}