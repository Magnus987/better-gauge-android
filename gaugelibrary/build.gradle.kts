plugins {
    id("com.android.library")
}

android {
    namespace = "com.ekn.gruzer.gaugelibrary"
    compileSdk = 36

    defaultConfig {
        minSdk = 31
    }
}

dependencies {
    implementation(libs.material)
}
