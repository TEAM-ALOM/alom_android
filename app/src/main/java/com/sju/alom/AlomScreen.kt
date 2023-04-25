package com.sju.alom

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class AlomScreen(@StringRes val title: Int) {
//    Login(title = "Login"),
//    Attendance(title = "Attendance")
}

@Composable
fun AlomApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {

}