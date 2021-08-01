package com.example.ciceron.navigation

import ru.terrakok.cicerone.Router
import javax.inject.Inject

class ScreenNavigatorImpl @Inject constructor(
    private val router: Router
    ) : ScreenNavigator {
    override fun navigateBack() = router.exit()

    override fun navigateToMain() = router.newRootScreen(Screens.MainScreen)

    override fun navigateToLogin() = router.newRootScreen(Screens.LoginScreen)

    override fun navigateToDriver() = router.navigateTo(Screens.DriverScreen)

    override fun navigateToSurvey() = router.navigateTo(Screens.SurveyScreen)

    override fun navigateToProblem() = router.replaceScreen(Screens.ProblemScreen)

    override fun navigateToGratitude() = router.replaceScreen(Screens.GratitudeScreen)
}