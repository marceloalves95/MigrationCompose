plugins {
    id("com.android.application")
    id("kotlin-android")
}
android {

    compileSdk = 31

    defaultConfig {
        applicationId = "br.com.migrationcompose"
        minSdk = 30
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.compose_version
    }

    packagingOptions {
        resources.excludes.add("META-INF/*")
    }
}
dependencies{
    implementation("br.com.core:compose:1.0.0")
    implementation("br.com.core:extensions:1.0.0")
    implementation("com.android.support:multidex:1.0.3")
    implementation(Dependencies.kotlin)
    implementation(Dependencies.kotlin_jdk)
    implementation(Dependencies.core_ktx)
    implementation(Dependencies.appcompat)
    implementation(Dependencies.constraintlayout)
    implementation(Dependencies.material)
    implementation(Dependencies.facebook_shimmer)
    implementation(Dependencies.compose_ui)
    implementation(Dependencies.compose_tooling)
    implementation(Dependencies.compose_foundation)
    implementation(Dependencies.compose_material)
    implementation(Dependencies.compose_material_icons_core)
    implementation(Dependencies.compose_material_icons_extended)
    implementation(Dependencies.compose_livedata)
    implementation(Dependencies.compose_ui_test)
    implementation(Dependencies.compose_activity)
}