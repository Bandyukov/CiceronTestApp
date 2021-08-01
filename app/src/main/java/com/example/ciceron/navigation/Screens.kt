package com.example.ciceron.navigation

import androidx.fragment.app.Fragment
import com.example.ciceron.fragments.*
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {
    object LoginScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = LoginFragment()
    }

    object MainScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = MainFragment()
    }

    object DriverScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = DriverFragment()
    }

    object SurveyScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = SurveyFragment()
    }

    object ProblemScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = ProblemFragment()
    }

    object GratitudeScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = GratitudeFragment()
    }
}