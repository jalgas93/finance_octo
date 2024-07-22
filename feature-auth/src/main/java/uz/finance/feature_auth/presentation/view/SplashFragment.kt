package uz.finance.feature_auth.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import uz.finance.feature_auth.R
import uz.finance.feature_auth.databinding.FragmentSplashBinding
import uz.finance.feature_auth.domain.navigation.NavigationAuth
import javax.inject.Inject
@AndroidEntryPoint
class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding

    @Inject
    lateinit var navigation: NavigationAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startBtn()
    }

    private fun startBtn() {
        binding.startBtn.setOnClickListener {
        navigation.onClickAuth()
        }
    }
}