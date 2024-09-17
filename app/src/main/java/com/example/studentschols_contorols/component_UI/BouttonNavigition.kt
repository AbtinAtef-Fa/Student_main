package com.example.studentschols_contorols.component_UI

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.rounded.Add
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreenStudent(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreenStudent(
        "Home",
        "Home",
        Icons.Filled.Home
    )

    object Search : BottomBarScreenStudent(
        "Search",
        "Search",
        Icons.Filled.Search
    )

    object NewItem : BottomBarScreenStudent(
        "New",
        "New",
        Icons.Rounded.Add
    )

    object About : BottomBarScreenStudent(
        "About",
        "About",
        Icons.Outlined.Face
    )
}