package com.sju.alom.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AttendanceScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Column(
            modifier = Modifier.padding(36.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
        ) {
            Row() {
                Text(
                    "안녕하세요, OO님\n오늘도 아롬하세요 🙂",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End,
                    fontSize = 16.sp,
                )
            }
            Column(
                modifier = Modifier.padding(top = 50.dp),
            ) {
                Text(
                    "현재 시간은",
                    fontSize = 14.sp,
                )
                Text(
                    "00월 00일 00시 00분 00초",
                    fontSize = 24.sp,
                )
            }

            Button(
                modifier = Modifier.fillMaxWidth().padding(top = 80.dp),
                contentPadding = PaddingValues(16.dp),
                onClick = {
                    // 로그인 로직 실행
                },
            ) {
                Text(
                    "출석체크하기",
                    fontSize = 16.sp,
                )
            }
        }
    }
}

@Preview
@Composable
fun AttendancePreview() {
    AttendanceScreen()
}
