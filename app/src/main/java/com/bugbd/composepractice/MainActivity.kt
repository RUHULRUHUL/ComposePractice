package com.bugbd.composepractice
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bugbd.composepractice.screen.DashBoard
import com.bugbd.composepractice.screen.LogIn
import com.bugbd.composepractice.screen.SignUPScreen
import com.bugbd.composepractice.ui.theme.ComposePracticeTheme
import com.bugbd.composepractice.utils.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {

                Surface(color = MaterialTheme.colorScheme.background) {

                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.SignUp.route
                    ){
                        composable(route = Screen.SignUp.route) {
                           SignUPScreen(navController)
                        }
                        composable(route = Screen.LogIn.route) {
                            LogIn(navController)
                        }
                        composable(
                            route = Screen.DashBoard.route
                        ) {
                            DashBoard(navController)

                        }

                    }

                }

            }
        }
    }
}