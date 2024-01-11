
-dontwarn okhttp3.internal.platform.**
-dontwarn org.conscrypt.**
-dontwarn org.bouncycastle.**
-dontwarn org.openjsse.**

-keep,allowobfuscation,allowshrinking class com.core.network.** { *; }
-keep,allowobfuscation,allowshrinking interface com.core.network.** { *; }

-keep,allowobfuscation,allowshrinking interface retrofit2.Call
-keep,allowobfuscation,allowshrinking class retrofit2.Response
-keep,allowobfuscation,allowshrinking class kotlin.coroutines.Continuation

# https://github.com/google/gson/commit/43396e45fd1f03e408e0e83b168a72a0f3e0b84e#diff-5da161239475717e284b3a9a85e2f39256d739fb7564ae7fda7f79cee000c413
-keepclasseswithmembers,allowobfuscation,includedescriptorclasses class * {
    @com.google.gson.annotations.SerializedName <fields>;
}
