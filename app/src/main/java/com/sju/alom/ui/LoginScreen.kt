package com.sju.alom.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(
    onLoginButtonClicked: (String) -> Unit,
) {
    val textState = remember { mutableStateOf("") }
    val checkedState = remember { mutableStateOf(true) }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Column(
            modifier = Modifier.padding(36.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text("학번")
                OutlinedTextField(
                    value = textState.value,
                    onValueChange = { textValue -> textState.value = textValue },
                    label = { Text("ex)18011642") },
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
            ) {
                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it },
                    modifier = Modifier.padding(start = 16.dp),
                )
                Text(
                    "자동로그인",
                )
            }

            Button(
                modifier = Modifier.fillMaxWidth().padding(top = 80.dp),
                contentPadding = PaddingValues(16.dp),
                onClick = {
                    onLoginButtonClicked(textState.value)
                },
            ) {
                Text(
                    "로그인",
                    fontSize = 16.sp,
                )
            }
        }
    }
}

@Preview
@Composable
fun LoginPreview() {
    LoginScreen(onLoginButtonClicked = {})
}
