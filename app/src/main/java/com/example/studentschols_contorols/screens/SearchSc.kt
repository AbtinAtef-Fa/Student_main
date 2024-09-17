package com.example.studentschols_contorols.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import com.example.studentschols_contorols.R
import com.example.studentschols_contorols.component_UI.CardItemStudent
import com.example.studentschols_contorols.data_moles.Model_student

@Composable
fun SearchSc(modifier: Modifier = Modifier) {
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
    var input by remember {
        mutableStateOf("")
    }
    Scaffold { padding ->
        Column(
            modifier = modifier
                .padding(padding)
                .background(color = colorResource(R.color.student_Search_happy))
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = input,
                onValueChange = { input = it },
                textStyle = TextStyle(color = Color.White),
                label = { Text("Search") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Red
                    )
                }
            )

            Column {
                LazyColumn {
                    items(StudentList){ item->
                        CardItemStudent(item_Student = item)
                    }
                }
            }
        }
    }
}