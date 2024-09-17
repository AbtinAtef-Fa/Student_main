package com.example.studentschols_contorols.component_UI

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.studentschols_contorols.data_moles.Model_student

@Composable
fun CardItemStudent(
    modifier: Modifier = Modifier,
    item_Student: Model_student
) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp,
            ),
            modifier = modifier
                .padding(horizontal = 3.dp, vertical = 3.dp)
                .fillMaxWidth()
                .height(80.dp),

            ) {
            Column(
                modifier = modifier
                    .padding(horizontal = 4.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    TextItemPersonal(
                        text = "نام:",
                        data = item_Student.name,
                        color = Color.Black
                    )
                    TextItemPersonal(
                        text = "نام خانوادگی:",
                        data = item_Student.family,
                        color = Color.Black
                    )
                    TextItemPersonal(
                        text = "نام کتاب",
                        data = item_Student.namebook,
                        color = Color.Black
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {

                        TextItemPersonal(
                            text = ":کد ملی",
                            data = item_Student.natialitycode,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TextItemPersonal(
    text: String,
    data: String = " ",
    color: Color
) {
    Text(
        text + " " + data,
        color = Color.Black
    )
}