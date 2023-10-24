package com.bugbd.composepractice.utils

sealed class Screen(val route: String) {

    data object SignUp : Screen("SignUp")
    data object LogIn : Screen("LogIn")
    data object DashBoard : Screen("DashBoard")

}
