package com.example.ciceron.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {
    companion object {
        @Provides
        @Singleton
        fun provideStr() : String = "Hello Epta"
    }
}