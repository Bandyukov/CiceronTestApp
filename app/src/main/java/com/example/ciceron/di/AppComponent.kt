package com.example.ciceron.di

import android.content.Context
import com.example.ciceron.MainActivity
import com.example.ciceron.navigation.ScreenNavigator
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, NavigationModule::class])
@Singleton
interface AppComponent {

    val s: String

    fun inject(mainActivity: MainActivity)

    val screenNavigator: ScreenNavigator

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun appContext(context: Context) : Builder

        fun build() : AppComponent
    }
}