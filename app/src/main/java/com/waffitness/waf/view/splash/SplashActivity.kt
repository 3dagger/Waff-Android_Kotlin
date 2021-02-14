package com.waffitness.waf.view.splash

import android.os.Bundle
import com.waffitness.waf.R
import com.waffitness.waf.base.BaseActivity
import com.waffitness.waf.databinding.ActivitySplashBinding
import com.waffitness.waf.view.splash.model.SplashViewModel
import org.koin.android.ext.android.inject

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(), SplashNavigator.View {
    override val layoutResourceId: Int get() = R.layout.activity_splash
    override val viewModel: SplashViewModel by inject()
    override fun initView(savedInstanceState: Bundle?) {
    }

    override fun onProcess() {
    }

    /**
     * @author : 이수현
     * @Date : 2/14/21 9:31 PM
     * @Description : View 가 부서질 때, ViewModel 의 onCleared() 호출(옵저버들을 전부 Clear 해주기 위해서)
     * @History : 
     *
     **/
    override fun onViewModelCleared() {
        viewModel.disposalbeClear()
    }
}