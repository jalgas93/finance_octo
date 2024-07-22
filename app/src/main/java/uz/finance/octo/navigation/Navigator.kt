package uz.finance.octo.navigation

import androidx.navigation.NavController
import dagger.hilt.android.scopes.ActivityScoped
import uz.finance.feature_auth.domain.navigation.NavigationAuth
import uz.finance.feature_dashboard.domain.navigation.NavigationDashboard
import javax.inject.Inject
@ActivityScoped
class Navigator @Inject constructor(
    private val navController: NavController
):NavigationDashboard, NavigationAuth {
    override fun onClickDashboard() {
        TODO("Not yet implemented")
    }

    override fun onClickAuth() {
        TODO("Not yet implemented")
    }
}