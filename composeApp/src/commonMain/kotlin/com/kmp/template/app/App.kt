package com.kmp.template.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kmp.template.core.domain.Theme
import com.kmp.template.core.presentation.theme.AppTheme

@Composable
fun App() {
    var theme by remember { mutableStateOf(Theme()) }

    val navController = rememberNavController()

    AppTheme(
        theme = theme
    ) {
        NavHost(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            navController = navController,
            startDestination = Routes.Home
        ) {
            composable<Routes.Home> {
                HomePage(
                    modifier = Modifier.widthIn(max = 500.dp),
                    onClickSettings = { navController.navigate(Routes.Settings) }
                )
            }

            composable<Routes.Settings> {
                SettingsPage(
                    modifier = Modifier.widthIn(max = 500.dp),
                    onBack = { navController.navigateUp() },
                    onThemeChange = { theme = it },
                    theme = theme
                )
            }
        }
    }
}