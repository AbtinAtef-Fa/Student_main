package com.example.studentschols_contorols.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.studentschols_contorols.R
import com.example.studentschols_contorols.component_UI.AppBarStudent

import com.example.studentschols_contorols.component_UI.CardItemStudent
import com.example.studentschols_contorols.data_moles.Model_student

@Composable
fun Home(modifier: Modifier = Modifier) {
    val StudentList = listOf(
        Model_student(
            1,
            "علی",
            "عربی",
            "صولتی",
            "0441625241",
            "تهران",
        ),
    )
    Scaffold(
        modifier = modifier,
        topBar = {
            AppBarStudent()
        },
        
        ) { p ->
        Column(
            modifier = modifier
                .padding(p)
                .background(color = colorResource(R.color.student_home_happy))
                .fillMaxSize()
        ) {
            LazyColumn {
                items(StudentList) { items_s ->
                    CardItemStudent(item_Student = items_s)
                }
            }
        }
    }
}

@Preview
@Composable
private fun tt() {
    Home()
}