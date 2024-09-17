package com.example.studentschols_contorols.component_UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.studentschols_contorols.R

@Composable
fun TextFieldUi(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var family by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var nationalCode by remember { mutableStateOf("") }

    var isValidName by remember { mutableStateOf(false) }
    var isValidFamily by remember { mutableStateOf(false) }
    var isValidAddress by remember { mutableStateOf(false) }
    var isValidNational by remember { mutableStateOf(false) }

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Column(
            modifier = modifier

                .background(Color.Gray)
                .padding(16.dp)
                .background(color = colorResource(R.color.student_Dialog_happy))// افزودن فاصله بین ستون و لبه صفحه
        ) {
            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = name,
                onValueChange = { nameInput ->
                    name = nameInput
                    isValidName = nameInput.isNotEmpty()
                },
                label = { Text("نام", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidName) {
                Text(
                    text = "نام نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }

            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = family,
                onValueChange = { familyInput ->
                    family = familyInput
                    isValidFamily = familyInput.isNotEmpty()
                },
                label = { Text("فامیل", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidFamily) {
                Text(
                    text = "فامیل نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }

            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = address,
                onValueChange = { addressInput ->
                    address = addressInput
                    isValidAddress = addressInput.isNotEmpty()
                },
                label = { Text("آدرس", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidAddress) {
                Text(
                    text = "آدرس نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }
            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = nationalCode,
                onValueChange = { nationalInput ->
                    nationalCode = nationalInput
                    isValidNational = nationalInput.isNotEmpty()
                },
                label = { Text("کدملی", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidNational) {
                Text(
                    text = "کد ملی نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun tt() {
    TextFieldUi()
}