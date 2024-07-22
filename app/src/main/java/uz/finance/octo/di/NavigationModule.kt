package uz.finance.octo.di

import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import uz.finance.feature_auth.domain.navigation.NavigationAuth
import uz.finance.feature_dashboard.domain.navigation.NavigationDashboard
import uz.finance.octo.R
import uz.finance.octo.navigation.Navigator

@Module
@InstallIn(ActivityComponent::class)
object NavigationModule {
    @Provides
    fun navController(activity: FragmentActivity): NavController {
        return NavHostFragment.findNavController(activity.supportFragmentManager.findFragmentById(R.id.nav_host_fragment)!!)
    }

    @Module
    @InstallIn(ActivityComponent::class)
    abstract class NavigationListModule {
        @Binds
        abstract fun bindDashboard(navigator: Navigator): NavigationDashboard

        @Binds
        abstract fun bindAuth(navigator: Navigator): NavigationAuth
    }
}