plugins {
    id("com.android.library")
}

android {
    namespace = "com.ekn.gruzer.gaugelibrary"
    compileSdk = 37

    defaultConfig {
        minSdk = 29
    }
}

dependencies {
    implementation(libs.material)
}
