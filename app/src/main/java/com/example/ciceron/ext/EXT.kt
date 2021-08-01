package com.example.ciceron

import androidx.fragment.app.Fragment
import com.example.ciceron.navigation.ScreenNavigator

val Fragment.screenNavigator: ScreenNavigator
    get() = DI.appComponent.screenNavigator
