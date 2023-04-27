package com.sju.alom

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sju.alom.ui.AttendanceScreen
import com.sju.alom.ui.LoginScreen
import com.sju.alom.ui.LoginViewModel

enum class AlomScreen(@StringRes val title: Int) {
    Login(title = R.string.route_login),
    Attendance(title = R.string.route_attendance),
}

@Composable
fun AlomApp(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = viewModel(),
    navController: NavHostController = rememberNavController(),
) {
    val navController = rememberNavController()

    Scaffold() { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()
        NavHost(
            navController = navController,
            startDestination = AlomScreen.Login.name,
            modifier = modifier.padding(innerPadding),
        ) {
            composable(route = AlomScreen.Login.name) {
                LoginScreen()
            }
            composable(route = AlomScreen.Attendance.name) {
                AttendanceScreen()
            }
        }
    }
}
