package com.waffitness.waf.view.splash.model

import com.waffitness.waf.base.BaseViewModel
import com.waffitness.waf.view.splash.SplashNavigator

class SplashViewModel : BaseViewModel<SplashNavigator.View>(), SplashNavigator.ViewModel {
    override fun disposalbeClear() {
        onCleared()
    }

}