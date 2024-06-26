package com.bitwarden.authenticator.data.platform.datasource.disk.di

import android.content.SharedPreferences
import com.bitwarden.authenticator.data.platform.datasource.di.UnencryptedPreferences
import com.bitwarden.authenticator.data.platform.datasource.disk.SettingsDiskSource
import com.bitwarden.authenticator.data.platform.datasource.disk.SettingsDiskSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PlatformDiskModule {

    @Provides
    @Singleton
    fun provideSettingsDiskSource(
        @UnencryptedPreferences sharedPreferences: SharedPreferences,
    ): SettingsDiskSource =
        SettingsDiskSourceImpl(sharedPreferences = sharedPreferences)
}
