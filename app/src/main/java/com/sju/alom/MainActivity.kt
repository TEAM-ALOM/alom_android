package com.sju.alom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sju.alom.ui.theme.AlomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    Column(
                        modifier = Modifier.padding(36.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,
                    ) {
                        InputStudentIdTextField()
                        LoginButton()
                    }
                }
            }
        }
    }
}

@Composable
fun InputStudentIdTextField() {
    var text by remember { mutableStateOf("") }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text("학번")
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("ex)18011642") },
        )
    }
}

@Composable
fun AutoLoginCheckBox() {
    val checkedState = remember { mutableStateOf(true) }

    Row() {
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it },
        )
        Text(
            "자동로그인",
        )
    }
}

@Composable
fun LoginButton() {
    Button(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        onClick = {
            // 로그인 로직 실행
        },
    ) {
        Text(
            "로그인",
            fontSize = 16.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AlomTheme {
        InputStudentIdTextField()
    }
}
