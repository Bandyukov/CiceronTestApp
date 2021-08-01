package com.example.ciceron.di

import com.example.ciceron.navigation.ScreenNavigator
import com.example.ciceron.navigation.ScreenNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import javax.inject.Singleton

@Module
abstract class NavigationModule {
    companion object {
        @Provides
        @Singleton
        fun provideCiceron(): Cicerone<Router> = Cicerone.create()


        @Provides
        @Singleton
        fun provideRouter(cicerone: Cicerone<Router>): Router = cicerone.router

        @Provides
        fun provideNavigatorHolder(cicerone: Cicerone<Router>): NavigatorHolder =
            cicerone.navigatorHolder

    }

    @Binds
    abstract fun bindScreenNavigator(screenNavigatorImpl: ScreenNavigatorImpl) : ScreenNavigator

}