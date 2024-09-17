package com.example.studentschols_contorols.navigition

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.studentschols_contorols.component_UI.BottomBarScreenStudent
import com.example.studentschols_contorols.component_UI.DialogStudentNew
import com.example.studentschols_contorols.screens.AboutSc
import com.example.studentschols_contorols.screens.Home
import com.example.studentschols_contorols.screens.SearchSc

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreenStudent.Home.route
    ){
        composable(
            route = BottomBarScreenStudent.Home.route
        ) {
            Home()
        }

        composable(
            route = BottomBarScreenStudent.Search.route
        ) {
            SearchSc()
        }

        composable(
            route = BottomBarScreenStudent.About.route
        ) {
            AboutSc()
        }

        composable(
            route = BottomBarScreenStudent.NewItem.route
        ) {
            DialogStudentNew()
        }
    }
}